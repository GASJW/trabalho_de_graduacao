package br.com.auxenf.DaoTest;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.auxenf.Dao.AgendaEnfDao;
import br.com.auxenf.Dao.EnfermeiroDao;
import br.com.auxenf.Dao.PacientesDao;
import br.com.auxenf.domain.AgendaEnf;
import br.com.auxenf.domain.Enfermeiro;
import br.com.auxenf.domain.Pacientes;


public class AgendaEnfDaoTest {
	@Ignore
	@Test
	public void salva() {
		
		EnfermeiroDao enfermeiroDao = new EnfermeiroDao();
		Enfermeiro enfermeiro = enfermeiroDao.buscar(1L);
		
		PacientesDao pacientesDao = new PacientesDao();
		Pacientes pacientes = pacientesDao.buscar(1L);
		
		AgendaEnf agendaEnf = new AgendaEnf();

		agendaEnf.setEnfCpf(enfermeiro);
		agendaEnf.setPacCpf(pacientes);
		agendaEnf.setDtPac(new Date());
		agendaEnf.setHoraPac(new Date());
		
		
		AgendaEnfDao agendaEnfDao = new AgendaEnfDao();
		agendaEnfDao.salvar(agendaEnf);
		
		System.out.println("Êxito no cadastro.");
		
	}
	
	@Ignore
	@Test
	public void listar() {
		
		AgendaEnfDao agendaEnfDao = new AgendaEnfDao();
		
		List<AgendaEnf> resultado = agendaEnfDao.listar();
		
		System.out.println("Total de Registros:" + resultado.size());
		
		for (AgendaEnf agendaEnf : resultado) {
			System.out.println(agendaEnf.getEnfCpf());
			System.out.println(agendaEnf.getPacCpf());
			System.out.println(agendaEnf.getDtPac());
			System.out.println(agendaEnf.getHoraPac());
		}
	}

	@Ignore
	@Test
	public void buscar(){

		Long codigo = 2L;

		AgendaEnfDao agendaEnfDao = new AgendaEnfDao();
		AgendaEnf agendaEnf = agendaEnfDao.buscar(codigo);

		

		if(agendaEnf == null){

			System.out.println("Nenhum registro encontrado");

		}else{

			System.out.println("Registro encontrado:");
			System.out.println(agendaEnf.getDtPac());
			System.out.println(agendaEnf.getHoraPac());

		}

	}
	
	@Ignore
	@Test
	public void excluir(){

		Long codigo = 2L;

		AgendaEnfDao agendaEnfDao = new AgendaEnfDao();
		AgendaEnf agendaEnf = agendaEnfDao.buscar(codigo);

		

		if(agendaEnf == null){

			System.out.println("Nenhum registro encontrado");

		}else{

			agendaEnfDao.excluir(agendaEnf);
			System.out.println("Registro apagado:");
			System.out.println(agendaEnf.getDtPac());
			System.out.println(agendaEnf.getHoraPac());

		}

	}
	
	//@Ignore
	@Test
	public void atualizar(){

		Long codigo = 1L;

		AgendaEnfDao agendaEnfDao = new AgendaEnfDao();
		AgendaEnf agendaEnf = agendaEnfDao.buscar(codigo);

		

		if(agendaEnf == null){

			System.out.println("Nenhum registro encontrado");

		}else{
			
			EnfermeiroDao enfermeiroDao = new EnfermeiroDao();
			Enfermeiro enfermeiro = enfermeiroDao.buscar(1L);
			
			PacientesDao pacientesDao = new PacientesDao();
			Pacientes pacientes = pacientesDao.buscar(1L);
			
			agendaEnf.setEnfCpf(enfermeiro);
			agendaEnf.setPacCpf(pacientes);
			agendaEnf.setDtPac(new Date());
			agendaEnf.setHoraPac(new Date());
			agendaEnfDao.atualizar(agendaEnf);
			System.out.println("Registro atualizado: " + agendaEnf.getEnfCpf());
			System.out.println("" + agendaEnf.getPacCpf());
			System.out.println("" + agendaEnf.getDtPac());
			System.out.println("" + agendaEnf.getHoraPac());

		}

	}
}
