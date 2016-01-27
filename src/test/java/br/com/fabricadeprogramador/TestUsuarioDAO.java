package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {		
		testExcluir();
	}
	
	public static void testCadastrar(){
		//Criando o Usu�rio
		Usuario usu = new Usuario();
		usu.setNome("J�oz�o");
		usu.setLogin("jzao");
		usu.setSenha("123");
		
		//Cadastrando o usuario no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
		System.out.println("Cadastrado com Sucesso!");
	}
	
	public static void testAlterar(){
		//Alterando o Usu�rio
		Usuario usu = new Usuario();
		usu.setId(4);
		usu.setNome("J�oz�o da Silva");
		usu.setLogin("jzaoss");
		usu.setSenha("12345678");
		
		//Alterando o usuario no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);
		System.out.println("Alterado com Sucesso!");
	}
	
	public static void testExcluir(){
		//Excluindo o Usu�rio
		Usuario usu = new Usuario();
		usu.setId(4);
		
		//Excluindo o usuario no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);
		System.out.println("Excluido com Sucesso!");
	}

}
