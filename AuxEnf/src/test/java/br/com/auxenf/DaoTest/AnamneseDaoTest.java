package br.com.auxenf.DaoTest;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.auxenf.Dao.AnamneseDao;
import br.com.auxenf.Dao.PacientesDao;
import br.com.auxenf.domain.Anamnese;
import br.com.auxenf.domain.Pacientes;

public class AnamneseDaoTest {
	@Ignore
	@Test
	public void salva() {
		
		PacientesDao pacientesDao = new PacientesDao();
		Pacientes pacientes = pacientesDao.buscar(1L);
		
		Anamnese anamnese = new Anamnese();

		anamnese.setTratMed("");
		anamnese.setMedUso("");
		anamnese.setAntAlerg("");
		anamnese.setMarcapasso(new Boolean(false));
		anamnese.setAltCard("");
		anamnese.setHipoT(new Boolean(false));
		anamnese.setHiperT(new Boolean(false));
		anamnese.setDistCirc("");
		anamnese.setDistRenal("");
		anamnese.setDistHorm("");
		anamnese.setDistGastro("");
		anamnese.setEpilepsia(new Boolean(false));
		anamnese.setAltPsi("");
		anamnese.setEstresse("");
		anamnese.setAntOnco("");
		anamnese.setDiabetes("");
		anamnese.setOutros("");
		anamnese.setTipoSang("");
		anamnese.setQueixas("");
		anamnese.setAntecedentes("");
		anamnese.setHistMorbPreg("");
		anamnese.setHistDoenAtual("");
		anamnese.setPacCpf(pacientes);
		
		
		AnamneseDao anamneseDao = new AnamneseDao();
		anamneseDao.salvar(anamnese);
		
		System.out.println("Êxito no cadastro do Anamnese.");
		
	}
	
	@Ignore
	@Test
	public void listar() {
		
		AnamneseDao anamneseDao = new AnamneseDao();
		
		List<Anamnese> resultado = anamneseDao.listar();
		
		System.out.println("Total de Registros:" + resultado.size());
		
		for (Anamnese anamnese : resultado) {
			System.out.println(anamnese.getPacCpf());
			System.out.println(anamnese.getTratMed());
			System.out.println(anamnese.getMedUso());
			System.out.println(anamnese.getAntAlerg());
			System.out.println(anamnese.getMarcapasso());
			System.out.println(anamnese.getAltCard());
			System.out.println(anamnese.getHipoT());
			System.out.println(anamnese.getHiperT());
			System.out.println(anamnese.getDistCirc());
			System.out.println(anamnese.getDistRenal());
			System.out.println(anamnese.getDistHorm());
			System.out.println(anamnese.getDistGastro());
			System.out.println(anamnese.getEpilepsia());
			System.out.println(anamnese.getAltPsi());
			System.out.println(anamnese.getEstresse());
			System.out.println(anamnese.getAntOnco());
			System.out.println(anamnese.getDiabetes());
			System.out.println(anamnese.getOutros());
			System.out.println(anamnese.getTipoSang());
			System.out.println(anamnese.getQueixas());
			System.out.println(anamnese.getAntecedentes());
			System.out.println(anamnese.getHistMorbPreg());
			System.out.println(anamnese.getHistDoenAtual());
		}
	}

	@Ignore
	@Test
	public void buscar(){

		Long codigo = 1L;

		AnamneseDao anamneseDao = new AnamneseDao();
		Anamnese anamnese = anamneseDao.buscar(codigo);

		

		if(anamnese == null){

			System.out.println("Nenhum registro encontrado");

		}else{

			System.out.println("Registro encontrado:");

			System.out.println(anamnese.getPacCpf());

		}

	}
	
	@Ignore
	@Test
	public void excluir(){

		Long codigo = 2L;

		AnamneseDao anamneseDao = new AnamneseDao();
		Anamnese anamnese = anamneseDao.buscar(codigo);

		

		if(anamnese == null){

			System.out.println("Nenhum registro encontrado");

		}else{

			anamneseDao.excluir(anamnese);
			System.out.println("Registro apagado:");
			System.out.println(anamnese.getPacCpf());

		}

	}
	
	//@Ignore
	@Test
	public void atualizar(){

		Long codigo = 1L;

		AnamneseDao anamneseDao = new AnamneseDao();
		Anamnese anamnese = anamneseDao.buscar(codigo);

		

		if(anamnese == null){

			System.out.println("Nenhum registro encontrado");

		}else{
			
			PacientesDao pacientesDao = new PacientesDao();
			Pacientes pacientes = pacientesDao.buscar(1L);

			anamnese.setTratMed("");
			anamnese.setMedUso("");
			anamnese.setAntAlerg("");
			anamnese.setMarcapasso(new Boolean(false));
			anamnese.setAltCard("");
			anamnese.setHipoT(new Boolean(false));
			anamnese.setHiperT(new Boolean(false));
			anamnese.setDistCirc("");
			anamnese.setDistRenal("");
			anamnese.setDistHorm("");
			anamnese.setDistGastro("");
			anamnese.setEpilepsia(new Boolean(false));
			anamnese.setAltPsi("");
			anamnese.setEstresse("");
			anamnese.setAntOnco("");
			anamnese.setDiabetes("");
			anamnese.setOutros("");
			anamnese.setTipoSang("");
			anamnese.setQueixas("");
			anamnese.setAntecedentes("");
			anamnese.setHistMorbPreg("");
			anamnese.setHistDoenAtual("");
			anamnese.setPacCpf(pacientes);
			
			anamneseDao.atualizar(anamnese);
			System.out.println("Registro atualizado: " + anamnese.getPacCpf());

		}

	}
}
