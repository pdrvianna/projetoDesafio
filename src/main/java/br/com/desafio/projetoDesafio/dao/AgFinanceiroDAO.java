package br.com.desafio.projetoDesafio.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.desafio.projetoDesafio.model.AgFinanceiro;

public interface AgFinanceiroDAO extends CrudRepository<AgFinanceiro, Integer>{

	//public AgFinanceiro findByEmailAndSenha(String nomeagente, String senha);

	
	
}

