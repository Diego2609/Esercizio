package it.dstech.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Utente {

	@Id
	private String cognome;
	private String nome;
	private int numero;

	public Utente() {

	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
