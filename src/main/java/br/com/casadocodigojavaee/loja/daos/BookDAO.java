package br.com.casadocodigojavaee.loja.daos;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.casadocodigojavaee.loja.models.Book;

public class BookDAO {
	@PersistenceContext
	private EntityManager manager;

	public void save(Book product) {
		manager.persist(product);
	}

}
