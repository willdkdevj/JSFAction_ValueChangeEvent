package br.com.supernovatech.model;

import java.util.Set;
import java.util.TreeSet;

public class Pais implements Comparable<Pais>{

	private String sigla, nome;
	private Continente continente;
	private Set<Regiao> regioes = new TreeSet<>();
	
	public Pais(String sigla, String nome, Continente continente) {
		super();
		this.sigla = sigla;
		this.nome = nome;
		this.continente = continente;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Continente getContinente() {
		return continente;
	}
	
	public void setContinente(Continente continente) {
		this.continente = continente;
	}

	@Override
	public int compareTo(Pais pais) {
		return this.nome.compareTo(pais.nome);
	}
	
	public int hashCode() {
		final int primo = 31;
		int resultado = 1;
		return primo * resultado + (sigla == null ? 0 : sigla.hashCode());
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Pais outro = (Pais) obj;
		if (sigla == null) {
			if (outro.sigla != null)
				return false;
		} else if (!sigla.equals(outro.sigla))
			return false;
		return true;
	}

	public Set<Regiao> getRegioes() {
		return regioes;
	}

	public void setRegioes(Set<Regiao> regioes) {
		this.regioes = regioes;
	}
}
