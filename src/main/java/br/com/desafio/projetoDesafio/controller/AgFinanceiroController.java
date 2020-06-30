package br.com.desafio.projetoDesafio.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.projetoDesafio.dao.AgFinanceiroDAO;
import br.com.desafio.projetoDesafio.model.AgFinanceiro;

@RestController
@CrossOrigin("*")
public class AgFinanceiroController {

	@Autowired               // injecao da dependência
	private AgFinanceiroDAO dao;
	
	@GetMapping("/agfinanceiros")
	public ArrayList<AgFinanceiro> listarTudo(){
		ArrayList<AgFinanceiro> lista = (ArrayList<AgFinanceiro>)dao.findAll();
		return lista;
	}
	
	/*@PostMapping("/login")
	public ResponseEntity<AgFinanceiro> login(@RequestBody AgFinanceiro incompleto) {
		
		AgFinanceiro resultado = dao.findByNomeAndSenha(incompleto.getNomeagente(), incompleto.getSenha());
		if (resultado != null) {  // achei um usuario no banco!
			if (incompleto.getSenha().equals(resultado.getSenha())) { // as senhas coincidem??
				resultado.setSenha("*******");
				return ResponseEntity.ok(resultado);
			}
			else {
				
				return ResponseEntity.status(403).build(); // retorno "Forbidden"
			}
		}
		else {
			return ResponseEntity.status(404).build();   // retorno um status de "Não encontrado"
		}
	}	*/
	
	
}
