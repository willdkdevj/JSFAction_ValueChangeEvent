package br.com.supernovatech.model;

import java.util.Set;
import java.util.TreeSet;

public class Continente implements Comparable<Continente>{

	private String sigla, nome;
	private Set<Pais> paises = new TreeSet<>();
	
	
	public Continente(String sigla, String nome) {
		super();
		this.sigla = sigla;
		this.nome = nome;
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
	
	public Set<Pais> getPaises() {
		return paises;
	}
	
	public void setPaises(Set<Pais> paises) {
		this.paises = paises;
	}

	@Override
	public int compareTo(Continente cont) {
		return this.nome.compareTo(cont.nome);
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
		
		Continente outro = (Continente) obj;
		if (sigla == null) {
			if (outro.sigla != null)
				return false;
		} else if (!sigla.equals(outro.sigla))
			return false;
		return true;
	}
	
}
