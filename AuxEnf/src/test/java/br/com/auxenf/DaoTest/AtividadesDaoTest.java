package br.com.auxenf.DaoTest;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.auxenf.Dao.AtividadesDao;
import br.com.auxenf.domain.Atividades;

public class AtividadesDaoTest {
	@Ignore
	@Test
	public void salva() {
		
		Atividades atividades = new Atividades();

		atividades.setNome("Dar Remédio");
		atividades.setDescricao("Dipirona 8/8h 50ml");
		
		
		AtividadesDao atividadesDao = new AtividadesDao();
		atividadesDao.salvar(atividades);
		
		System.out.println("Êxito no cadastro da Atividade.");
		
	}
	
	@Ignore
	@Test
	public void listar() {
		
		AtividadesDao atividadesDao = new AtividadesDao();
		
		List<Atividades> resultado = atividadesDao.listar();
		
		System.out.println("Total de Registros:" + resultado.size());
		
		for (Atividades atividades : resultado) {
			System.out.println(atividades.getNome());
			System.out.println(atividades.getDescricao());
		}
	}

	@Ignore
	@Test
	public void buscar(){

		Long codigo = 2L;

		AtividadesDao atividadesDao = new AtividadesDao();
		Atividades atividades = atividadesDao.buscar(codigo);

		

		if(atividades == null){

			System.out.println("Nenhum registro encontrado");

		}else{

			System.out.println("Registro encontrado:");
			System.out.println(atividades.getNome());
			System.out.println(atividades.getDescricao());

		}
	}
	
	@Ignore
	@Test
	public void excluir(){

		Long codigo = 2L;

		AtividadesDao atividadesDao = new AtividadesDao();
		Atividades atividades = atividadesDao.buscar(codigo);

		

		if(atividades == null){

			System.out.println("Nenhum registro encontrado");

		}else{

			atividadesDao.excluir(atividades);
			System.out.println("Registro apagado:");
			System.out.println(atividades.getNome());
			System.out.println(atividades.getDescricao());

		}

	}
	
	//@Ignore
	@Test
	public void atualizar(){

		Long codigo = 1L;

		AtividadesDao atividadesDao = new AtividadesDao();
		Atividades atividades = atividadesDao.buscar(codigo);

		

		if(atividades == null){

			System.out.println("Nenhum registro encontrado");

		}else{
			
			atividades.setNome("Dar Remédio");
			atividades.setDescricao("Dipirona 8/8h 50ml");
			atividadesDao.atualizar(atividades);
			System.out.println("Registro atualizado: " + atividades.getNome());
			System.out.println("" + atividades.getDescricao());

		}

	}
}