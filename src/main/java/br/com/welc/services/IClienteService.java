/**
 * 
 */
package br.com.welc.services;

import br.com.welc.domain.Cliente;
import br.com.welc.exceptions.TipoChaveNaoEncontradaException;

/**
 * 
 */
public interface IClienteService {

	Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;
	
	Cliente buscarPorCPF(Long cpf);
	
	void excluir(Long cpf);
	 
	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;;

	//Boolean cadastrar(Cliente cliente);
}
