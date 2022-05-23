package br.com.auxenf.DaoTest;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.auxenf.Dao.HistoricoDao;
import br.com.auxenf.Dao.PacientesDao;
import br.com.auxenf.domain.Historico;
import br.com.auxenf.domain.Pacientes;

public class HistoricoDaoTest {
	@Ignore
	@Test
	public void salva() {
		
		PacientesDao pacientesDao = new PacientesDao();
		Pacientes pacientes = pacientesDao.buscar(1L);
		
		Historico historico = new Historico();

		historico.setPacCpf(pacientes);
		historico.setDtConsulta(new Date());
		historico.setHoraConsulta(new Date());
		historico.setNomeMed("Maria Luiza");
		historico.setEspecMed("Genicologista");
		historico.setDescrConsulta("Fomos instruidos a usar a pomada tal 2 vezes por dia durante 7 dias.");
		
		
		HistoricoDao historicoDao = new HistoricoDao();
		historicoDao.salvar(historico);
		
		System.out.println("Êxito no cadastro da Atividade.");
		
	}
	
	@Ignore
	@Test
	public void listar() {
		
		HistoricoDao historicoDao = new HistoricoDao();
		
		List<Historico> resultado = historicoDao.listar();
		
		System.out.println("Total de Registros:" + resultado.size());
		
		for (Historico historico : resultado) {
			System.out.println(historico.getDtConsulta());
			System.out.println(historico.getDescrConsulta());
		}
	}

	@Ignore
	@Test
	public void buscar(){

		Long codigo = 2L;

		HistoricoDao historicoDao = new HistoricoDao();
		Historico historico = historicoDao.buscar(codigo);

		

		if(historico == null){

			System.out.println("Nenhum registro encontrado");

		}else{

			System.out.println("Registro encontrado:");
			System.out.println(historico.getDtConsulta());
			System.out.println(historico.getDescrConsulta());

		}
	}
	
	@Ignore
	@Test
	public void excluir(){

		Long codigo = 2L;

		HistoricoDao historicoDao = new HistoricoDao();
		Historico historico = historicoDao.buscar(codigo);

		

		if(historico == null){

			System.out.println("Nenhum registro encontrado");

		}else{

			historicoDao.excluir(historico);
			System.out.println("Registro apagado:");
			System.out.println(historico.getDtConsulta());
			System.out.println(historico.getDescrConsulta());

		}

	}
	
	//@Ignore
	@Test
	public void atualizar(){

		Long codigo = 1L;

		HistoricoDao historicoDao = new HistoricoDao();
		Historico historico = historicoDao.buscar(codigo);

		

		if(historico == null){

			System.out.println("Nenhum registro encontrado");

		}else{
			
			
			PacientesDao pacientesDao = new PacientesDao();
			Pacientes pacientes = pacientesDao.buscar(1L);

			historico.setPacCpf(pacientes);
			historico.setDtConsulta(new Date());
			historico.setHoraConsulta(new Date());
			historico.setNomeMed("Maria Luiza");
			historico.setEspecMed("Genicologista");
			historico.setDescrConsulta("Fomos instruidos a usar a pomada tal 2 vezes por dia durante 7 dias.");
			historicoDao.atualizar(historico);
			System.out.println("Registro atualizado: " + historico.getPacCpf());
			System.out.println("" + historico.getDtConsulta());
			System.out.println("" + historico.getHoraConsulta());
			System.out.println("" + historico.getNomeMed());
			System.out.println("" + historico.getEspecMed());
			System.out.println("" + historico.getDescrConsulta());
			
		}

	}
}