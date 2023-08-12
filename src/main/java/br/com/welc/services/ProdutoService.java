package br.com.welc.services;

import br.com.welc.dao.IProdutoDAO;
import br.com.welc.domain.Produto;
import br.com.welc.services.generic.GenericService;

//public abstract class ClienteService extends GenericService<Cliente, Long> implements IClienteService {


public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
