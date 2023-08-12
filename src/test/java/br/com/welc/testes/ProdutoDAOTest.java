package br.com.welc.testes;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;

import br.com.welc.dao.IProdutoDAO;
import br.com.welc.dao.ProdutoDAO;
import br.com.welc.domain.Produto;
import br.com.welc.exceptions.TipoChaveNaoEncontradaException;

public class ProdutoDAOTest {
	
	private IProdutoDAO produtoDao;

	private Produto produto;
	
	public ProdutoDAOTest() {
		produtoDao = new ProdutoDAO(); 
	}
	
	@Before
	public void init() throws TipoChaveNaoEncontradaException {
		produto = new Produto();
		produto.setCodigo("A1");
		produto.setDescricao("Produto 1");
		produto.setNome("Produto 1");
		produto.setValor(BigDecimal.TEN);
		produtoDao.cadastrar(produto);
	}
	
	@Test(expected = Exception.class)
	public void pesquisar() {
		Produto produto = this.produtoDao.consultar(this.produto.getCodigo());
		Assert.assertNotNull(produto);
	}
	
	 
	
	
	@Test(expected = Exception.class)
	public void salvar() throws TipoChaveNaoEncontradaException {
		produto.setCodigo("A2");
		Boolean retorno = produtoDao.cadastrar(produto);
		Assert.assertTrue(retorno);
	}
	
	@Test(expected = Exception.class)
	public void excluir() {
		produtoDao.excluir(produto.getCodigo());
	}
	
	@Test(expected = Exception.class)
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		produto.setNome("Rodrigo Pires");
		produtoDao.alterar(produto);
		
		Assert.assertEquals("Rodrigo Pires", produto.getNome());
	}
	
	@Test(expected = Exception.class)
	public void buscarTodos() {
		Collection<Produto> list = produtoDao.buscarTodos();
		assertTrue(list != null);
		assertTrue(list.size() == 2);
	}
}
