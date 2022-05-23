package br.com.auxenf.DaoTest;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.auxenf.Dao.PessoaDao;
import br.com.auxenf.Dao.UsuarioDao;
import br.com.auxenf.Dao.EnfermeiroDao;
import br.com.auxenf.domain.Pessoa;
import br.com.auxenf.domain.Usuario;
import br.com.auxenf.domain.Enfermeiro;


public class EnfermeiroDaoTest {
	@Ignore
	@Test
	public void salva() {
		
		PessoaDao pessoaDao = new PessoaDao();
		Pessoa pessoa = pessoaDao.buscar(1L);
		
		UsuarioDao usuarioDao = new UsuarioDao();
		Usuario usuario = usuarioDao.buscar(1L);
		
		Enfermeiro enfermeiro = new Enfermeiro();

		enfermeiro.setPessoa(pessoa);
		enfermeiro.setHrTrab(8);
		enfermeiro.setHrDisp(2);
		enfermeiro.setLogin(usuario);
		enfermeiro.setStatus(new Boolean(false));
		
		
		EnfermeiroDao enfermeiroDao = new EnfermeiroDao();
		enfermeiroDao.salvar(enfermeiro);
		
		System.out.println("Êxito no cadastro do Enfermeiro.");
		
	}
	
	@Ignore
	@Test
	public void listar() {
		
		EnfermeiroDao enfermeiroDao = new EnfermeiroDao();
		
		List<Enfermeiro> resultado = enfermeiroDao.listar();
		
		System.out.println("Total de Registros:" + resultado.size());
		4
		for (Enfermeiro enfermeiro : resultado) {
			System.out.println(enfermeiro.getNome());
			System.out.println(enfermeiro.getRg());
			System.out.println(enfermeiro.getEnfCpf());
			System.out.println(enfermeiro.getHrTrab());
			System.out.println(enfermeiro.getHrDisp());
			System.out.println(enfermeiro.getTelefone());
			System.out.println(enfermeiro.getEmail());
			System.out.println(enfermeiro.getSenha());
			System.out.println(enfermeiro.getStatus());
		}
	}

	@Ignore
	@Test
	public void buscar(){

		Long codigo = 1L;

		EnfermeiroDao enfermeiroDao = new EnfermeiroDao();
		Enfermeiro enfermeiro = enfermeiroDao.buscar(codigo);

		

		if(enfermeiro == null){

			System.out.println("Nenhum registro encontrado");

		}else{

			System.out.println("Registro encontrado:");

			System.out.println(enfermeiro.getNome());

		}

	}
	
	@Ignore
	@Test
	public void excluir(){

		Long codigo = 2L;
		
		UsuarioDao usuarioDao = new UsuarioDao();
		Usuario usuario = usuarioDao.buscar(1L);
		
		PessoaDao pessoaDao = new PessoaDao();
		Pessoa pessoa = pessoaDao.buscar(1L);

		EnfermeiroDao enfermeiroDao = new EnfermeiroDao();
		Enfermeiro enfermeiro = enfermeiroDao.buscar(codigo);

		

		if(enfermeiro == null){

			System.out.println("Nenhum registro encontrado");

		}else{

			enfermeiroDao.excluir(enfermeiro);
			System.out.println("Registro apagado:");
			System.out.println(enfermeiro.getNome());

		}

	}
	
	//@Ignore
	@Test
	public void atualizar(){

		Long codigo = 1L;

		EnfermeiroDao enfermeiroDao = new EnfermeiroDao();
		Enfermeiro enfermeiro = enfermeiroDao.buscar(codigo);

		

		if(enfermeiro == null){

			System.out.println("Nenhum registro encontrado");

		}else{
			
			enfermeiro.setNome();
			enfermeiro.setRg("56.759.578-x");
			enfermeiro.setEnfCpf("459.564.228-82");
			enfermeiro.setHrTrab(8);
			enfermeiro.setHrDisp(4);
			enfermeiro.setTelefone("11948088701");
			enfermeiro.setEmail("guiraqueldavi@hotmail.com");
			enfermeiro.setSenha("123456789");
			enfermeiro.setStatus(new Boolean(false));
			enfermeiroDao.atualizar(enfermeiro);
			System.out.println("Registro atualizado: " + enfermeiro.getNome());
			System.out.println("" + enfermeiro.getRg());
			System.out.println("" + enfermeiro.getEnfCpf());

		}

	}
}
