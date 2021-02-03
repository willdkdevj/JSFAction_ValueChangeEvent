package br.com.supernovatech.model;

import java.util.Set;
import java.util.TreeSet;

public class Regiao implements Comparable<Regiao> {

	private String sigla, nome;
	private Pais pais;
	private Set<Estado> estados = new TreeSet<>();
	
	
	public Regiao(String sigla, String nome, Pais pais) {
		super();
		this.sigla = sigla;
		this.nome = nome;
		this.setPais(pais);
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



	public Set<Estado> getEstados() {
		return estados;
	}



	public void setEstados(Set<Estado> estados) {
		this.estados = estados;
	}


	@Override
	public int compareTo(Regiao r) {
		return this.nome.compareTo(r.nome);
	}
	
	public int hashCode() {
		final int primo = 31;
		int resultado = 1;
		
		return primo * resultado + ((sigla == null) ? 0 : sigla.hashCode());
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Regiao outro = (Regiao) obj;
		if (sigla == null) {
			if (outro.sigla != null)
				return false;
		} else if (!sigla.equals(outro.sigla))
			return false;
		return true;
	}


	public Pais getPais() {
		return pais;
	}


	public void setPais(Pais pais) {
		this.pais = pais;
	}
}
