package br.com.casadocodigojavaee.loja.managedbeans;

import javax.enterprise.inject.Model;

@Model
public class AdminBooksBean {
	public void save(){
		System.out.println("Precisamos salvar o livro!!");
		}

}
