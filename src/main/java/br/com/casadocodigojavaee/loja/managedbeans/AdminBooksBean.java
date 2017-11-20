package br.com.casadocodigojavaee.loja.managedbeans;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.casadocodigojavaee.loja.daos.BookDAO;
import br.com.casadocodigojavaee.loja.models.Book;

@Model
public class AdminBooksBean {

	private Book product = new Book();
	@Inject
	private BookDAO bookDAO = new BookDAO();

	public void save() {
		bookDAO.save(product);
	}

	public Book getProduct() {
		return product;
	}
}
