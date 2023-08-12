package br.com.welc.dao;

import br.com.welc.dao.generic.IGenericDAO;
import br.com.welc.domain.Venda;
import br.com.welc.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}

