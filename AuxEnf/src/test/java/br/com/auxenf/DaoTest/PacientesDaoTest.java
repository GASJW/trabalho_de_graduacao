package br.com.auxenf.DaoTest;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.auxenf.Dao.EnfermeiroDao;
import br.com.auxenf.Dao.PacientesDao;
import br.com.auxenf.Dao.PessoaDao;
import br.com.auxenf.domain.Enfermeiro;
import br.com.auxenf.domain.Pacientes;
import br.com.auxenf.domain.Pessoa;

public class PacientesDaoTest {
	@Ignore
	@Test
	public void salva() {
		
		PessoaDao pessoaDao = new PessoaDao();
		Pessoa pessoa = pessoaDao.buscar(1L);
		
		EnfermeiroDao enfermeiroDao = new EnfermeiroDao();
		Enfermeiro enfermeiro = enfermeiroDao.buscar(1L);
		
		Pacientes pacientes = new Pacientes();

		pacientes.setNome(pessoa);
		pacientes.setRg("55.456.524-3");
		pacientes.setPacCpf("456.295.726-56");
		pacientes.setNomeResp("Elder");
		pacientes.setDtNasc(new Date());
		pacientes.setEndereco("Rua 12 de Outubro, 352");
		pacientes.setTelResp("14998652736");
		pacientes.setStatus(new Boolean(false));
		pacientes.setEnfCpf(enfermeiro);
		
		
		PacientesDao pacientesDao = new PacientesDao();
		pacientesDao.salvar(pacientes);
		
		System.out.println("Êxito no cadastro do paciente.");
		
	}
	
	@Ignore
	@Test
	public void listar() {
		
		PacientesDao pacientesDao = new PacientesDao();
		
		List<Pacientes> resultado = pacientesDao.listar();
		
		System.out.println("Total de Registros:" + resultado.size());
		
		for (Pacientes pacientes : resultado) {
			System.out.println(pacientes.getNome());
			System.out.println(pacientes.getRg());
			System.out.println(pacientes.getPacCpf());
			System.out.println(pacientes.getNomeResp());
			System.out.println(pacientes.getDtNasc());
			System.out.println(pacientes.getEndereco());
			System.out.println(pacientes.getTelResp());
			System.out.println(pacientes.getStatus());
			System.out.println(pacientes.getEnfCpf());
		}
	}

	@Ignore
	@Test
	public void buscar(){

		Long codigo = 1L;

		PacientesDao pacientesDao = new PacientesDao();
		Pacientes pacientes = pacientesDao.buscar(codigo);

		

		if(pacientes == null){

			System.out.println("Nenhum registro encontrado");

		}else{

			System.out.println("Registro encontrado:");

			System.out.println(pacientes.getNome());

		}

	}
	
	@Ignore
	@Test
	public void excluir(){

		Long codigo = 2L;

		PacientesDao pacientesDao = new PacientesDao();
		Pacientes pacientes = pacientesDao.buscar(codigo);

		

		if(pacientes == null){

			System.out.println("Nenhum registro encontrado");

		}else{

			pacientesDao.excluir(pacientes);
			System.out.println("Registro apagado:");
			System.out.println(pacientes.getNome());

		}

	}
	
	//@Ignore
	@Test
	public void atualizar(){

		Long codigo = 1L;

		PacientesDao pacientesDao = new PacientesDao();
		Pacientes pacientes = pacientesDao.buscar(codigo);

		

		if(pacientes == null){

			System.out.println("Nenhum registro encontrado");

		}else{
			
			EnfermeiroDao enfermeiroDao = new EnfermeiroDao();
			Enfermeiro enfermeiro = enfermeiroDao.buscar(1L);
			
			pacientes.setNome("Rafael");
			pacientes.setRg("55.456.524-3");
			pacientes.setPacCpf("456.295.726-56");
			pacientes.setNomeResp("Elder");
			pacientes.setDtNasc(new Date());
			pacientes.setEndereco("Rua 12 de Outubro, 352");
			pacientes.setTelResp("14998652736");
			pacientes.setStatus(new Boolean(false));
			pacientes.setEnfCpf(enfermeiro);
			pacientesDao.atualizar(pacientes);
			System.out.println("Registro atualizado: " + pacientes.getNome());
			System.out.println("" + pacientes.getRg());
			System.out.println("" + pacientes.getPacCpf());

		}

	}
}
