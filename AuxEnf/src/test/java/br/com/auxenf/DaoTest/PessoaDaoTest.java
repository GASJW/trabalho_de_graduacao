package br.com.auxenf.DaoTest;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.auxenf.Dao.PessoaDao;
import br.com.auxenf.domain.Pessoa;

public class PessoaDaoTest {
public void salva() {
		
		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Guilherme");
		pessoa.setRg("56.759.578-X");
		pessoa.setCpf("459.564.228-82");
		pessoa.setTelefone("1499867230");
		pessoa.setEmail("guilhermeguto5@gmail.com");
		
		
		PessoaDao pessoaDao = new PessoaDao();
		pessoaDao.salvar(pessoa);
		
		System.out.println("Êxito no cadastro do Pessoa.");
		
	}
	
	@Ignore
	@Test
	public void listar() {
		
		PessoaDao pessoaDao = new PessoaDao();
		
		List<Pessoa> resultado = pessoaDao.listar();
		
		System.out.println("Total de Registros:" + resultado.size());
		
		for (Pessoa pessoa : resultado) {
			System.out.println(pessoa.getNome());
			System.out.println(pessoa.getRg());
			System.out.println(pessoa.getCpf());
			System.out.println(pessoa.getTelefone());
			System.out.println(pessoa.getEmail());
		}
	}

	@Ignore
	@Test
	public void buscar(){

		Long codigo = 1L;

		PessoaDao pessoaDao = new PessoaDao();
		Pessoa pessoa = pessoaDao.buscar(codigo);

		

		if(pessoa == null){

			System.out.println("Nenhum registro encontrado");

		}else{

			System.out.println("Registro encontrado:");

			System.out.println(pessoa.getNome());

		}

	}
	
	@Ignore
	@Test
	public void excluir(){

		Long codigo = 2L;

		PessoaDao pessoaDao = new PessoaDao();
		Pessoa pessoa = pessoaDao.buscar(codigo);

		

		if(pessoa == null){

			System.out.println("Nenhum registro encontrado");

		}else{

			pessoaDao.excluir(pessoa);
			System.out.println("Registro apagado:");
			System.out.println(pessoa.getNome());

		}

	}
	
	//@Ignore
	@Test
	public void atualizar(){

		Long codigo = 1L;

		PessoaDao pessoaDao = new PessoaDao();
		Pessoa pessoa = pessoaDao.buscar(codigo);

		

		if(pessoa == null){

			System.out.println("Nenhum registro encontrado");

		}else{
			
			pessoa.setNome("Guilherme");
			pessoa.setRg("56.759.578-x");
			pessoa.setCpf("459.564.228-82");
			pessoa.setTelefone("11948088701");
			pessoa.setEmail("guiraqueldavi@hotmail.com");
			pessoaDao.atualizar(pessoa);
			System.out.println("Registro atualizado: " + pessoa.getNome());
			System.out.println("" + pessoa.getRg());
			System.out.println("" + pessoa.getCpf());

		}

	}
}