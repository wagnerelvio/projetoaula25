package br.com.welc.dao;

import br.com.welc.dao.generic.IGenericDAO;
import br.com.welc.domain.Cliente;

//public interface IClienteDAO {
public interface IClienteDAO extends IGenericDAO<Cliente, Long> {

	Class<Cliente> getTipoClasse();

	void atualiarDados(Cliente entity, Cliente entityCadastrado);

	
/*
 	Boolean salvar(Cliente cliente);
 
	
	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente);

 */
	//Cliente buscarPorCPF(long cpf);


 
}
