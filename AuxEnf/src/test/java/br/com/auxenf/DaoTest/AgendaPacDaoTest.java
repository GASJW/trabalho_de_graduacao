package br.com.auxenf.DaoTest;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.auxenf.Dao.AgendaPacDao;
import br.com.auxenf.Dao.AtividadesDao;
import br.com.auxenf.domain.AgendaPac;
import br.com.auxenf.domain.Atividades;

public class AgendaPacDaoTest {
	@Ignore
	@Test
	public void salva() {
		
		AtividadesDao atividadesDao = new AtividadesDao();
		Atividades atividades = atividadesDao.buscar(1L);
		
		AgendaPac agendaPac = new AgendaPac();

		agendaPac.setHora(new Date());
		agendaPac.setData(new Date());
		agendaPac.setNome(atividades);
		
		
		AgendaPacDao agendaPacDao = new AgendaPacDao();
		agendaPacDao.salvar(agendaPac);
		
		System.out.println("Êxito no cadastro.");
		
	}
	
	@Ignore
	@Test
	public void listar() {
		
		AgendaPacDao agendaPacDao = new AgendaPacDao();
		
		List<AgendaPac> resultado = agendaPacDao.listar();
		
		System.out.println("Total de Registros:" + resultado.size());
		
		for (AgendaPac agendaPac : resultado) {
			System.out.println(agendaPac.getHora());
			System.out.println(agendaPac.getData());
			System.out.println(agendaPac.getNome());
		}
	}

	@Ignore
	@Test
	public void buscar(){

		Long codigo = 2L;

		AgendaPacDao agendaPacDao = new AgendaPacDao();
		AgendaPac agendaPac = agendaPacDao.buscar(codigo);

		

		if(agendaPac == null){

			System.out.println("Nenhum registro encontrado");

		}else{

			System.out.println("Registro encontrado:");
			System.out.println(agendaPac.getHora());
			System.out.println(agendaPac.getData());
			System.out.println(agendaPac.getNome());

		}

	}
	
	@Ignore
	@Test
	public void excluir(){

		Long codigo = 2L;

		AgendaPacDao agendaPacDao = new AgendaPacDao();
		AgendaPac agendaPac = agendaPacDao.buscar(codigo);

		

		if(agendaPac == null){

			System.out.println("Nenhum registro encontrado");

		}else{

			agendaPacDao.excluir(agendaPac);
			System.out.println("Registro apagado:");
			System.out.println(agendaPac.getHora());
			System.out.println(agendaPac.getData());
			System.out.println(agendaPac.getNome());

		}

	}
	
	//@Ignore
	@Test
	public void atualizar(){

		Long codigo = 1L;

		AgendaPacDao agendaPacDao = new AgendaPacDao();
		AgendaPac agendaPac = agendaPacDao.buscar(codigo);

		

		if(agendaPac == null){

			System.out.println("Nenhum registro encontrado");

		}else{
			
			AtividadesDao atividadesDao = new AtividadesDao();
			Atividades atividades = atividadesDao.buscar(1L);
			
			agendaPac.setHora(new Date());
			agendaPac.setData(new Date());
			agendaPac.setNome(atividades);
			agendaPacDao.atualizar(agendaPac);
			System.out.println("Registro atualizado: " + agendaPac.getHora());
			System.out.println("" + agendaPac.getData());
			System.out.println("" + agendaPac.getNome());

		}

	}
}
