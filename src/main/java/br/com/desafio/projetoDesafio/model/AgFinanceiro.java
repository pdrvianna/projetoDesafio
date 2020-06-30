package br.com.desafio.projetoDesafio.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

		
	@Entity
	@Table(name="MTB310_ag_financeiro")
	public class AgFinanceiro{
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id_agente")
		private int id_agente;
		
		@Column(name="nome_agente", length=100, nullable=false)
		private String nomeagente;
		
		@Column(name="senha", length=10, nullable=false)
		private String senha;
		
		@Column(name="volume_transacional")
		private float volume_transacional;
		

		@JsonIgnoreProperties("agt")
		@OneToMany(mappedBy="agt", cascade=CascadeType.ALL)
		private List<Transaction> listaTransaction;
		
		
		//Getters and Setters
		
		public List<Transaction> getListaTransation() {
			return listaTransaction;
		}


		public int getId_agente() {
			return id_agente;
		}


		public void setId_agente(int id_agente) {
			this.id_agente = id_agente;
		}


		public String getNomeagente() {
			return nomeagente;
		}


		public void setNomeagente(String nomeagente) {
			this.nomeagente = nomeagente;
		}


		public String getSenha() {
			return senha;
		}


		public void setSenha(String senha) {
			this.senha = senha;
		}


		public float getVolume_transacional() {
			return volume_transacional;
		}


		public void setVolume_transacional(float volume_transacional) {
			this.volume_transacional = volume_transacional;
		}


		public List<Transaction> getListaTransaction() {
			return listaTransaction;
		}


		public void setListaTransaction(List<Transaction> listaTransaction) {
			this.listaTransaction = listaTransaction;
		}

		
		

	
	


		
	

				
		

}
