package br.com.welc.testes;
/*
 * 
 */
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.welc.dao.IClienteDAO;
import br.com.welc.domain.Cliente;
import br.com.welc.exceptions.TipoChaveNaoEncontradaException;
import br.com.welc.services.ClienteService;
import br.com.welc.services.IClienteService;
import br.com.welc.testes.dao.ClienteDaoMock;

	
		 
		
		public class ClienteServiceTest {
			
			private IClienteService clienteService;
			
			private Cliente cliente;
			
			public ClienteServiceTest() {
				IClienteDAO dao = new ClienteDaoMock();
				clienteService = new ClienteService(dao);
			}
			
			@Before
			public void init () {
//				Cliente cliente = new Cliente();
				cliente  = new Cliente();
				cliente.setCpf(12312312312L);
				cliente.setNome("Wagner");
				cliente.setCidade("São Luis");
				cliente.setEstado("MA");
				cliente.setNumero(101010);
				cliente.setTel(981111111L);
				
			}
			
			@Test
			public void pesquisarCliente() {
				Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
				Assert.assertNotNull(clienteConsultado);
			}
			
			@Test
			public void salvarCliente() throws TipoChaveNaoEncontradaException {
				Boolean retorno = clienteService.cadastrar(cliente);
				
				Assert.assertTrue(retorno);
			}

				
			
			
			
			
			@Test
			public void excluirCliente() {
				//clienteService.excluir(cliente.getCpf());
				clienteService.excluir(cliente.getCpf());
			}
			
			@Test
			public void alterarCliente() throws TipoChaveNaoEncontradaException {
				cliente.setNome("Wagner Elvio");
				clienteService.alterar(cliente);
				
				Assert.assertEquals("Wagner Elvio", cliente.getNome());
			}
		}
