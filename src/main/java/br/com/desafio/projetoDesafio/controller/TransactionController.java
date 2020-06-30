package br.com.desafio.projetoDesafio.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.projetoDesafio.dao.TransactionDAO;
import br.com.desafio.projetoDesafio.model.Transaction;

@RestController
@CrossOrigin("*")
public class TransactionController {
	
	@Autowired
	TransactionDAO dao;
	
	@GetMapping("/transactions")
	public ArrayList<Transaction> listarTodos(){
		ArrayList<Transaction> lista = (ArrayList<Transaction>)dao.findAll();
		return lista;
	}
	
	
	@GetMapping("/transactions/{id}")
	public ResponseEntity<Transaction> buscarPeloId(@PathVariable int id){
		Transaction trans = dao.findById(id).orElse(null);
		if (trans != null) {
			return ResponseEntity.ok(trans);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}

}
