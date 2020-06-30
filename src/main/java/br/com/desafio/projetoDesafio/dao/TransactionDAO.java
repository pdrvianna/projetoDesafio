package br.com.desafio.projetoDesafio.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.desafio.projetoDesafio.model.Transaction;

public interface TransactionDAO extends CrudRepository<Transaction, Integer> {
	

}
