package br.com.supernovatech.model;

public class Estado implements Comparable<Estado> {
	private String sigla, nome;
	private Regiao regiao;
	
	
	public Estado(String sigla, String nome, Regiao regiao) {
		super();
		this.sigla = sigla;
		this.nome = nome;
		this.regiao = regiao;
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
	public Regiao getRegiao() {
		return regiao;
	}
	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}

	@Override
	public int compareTo(Estado e) {
		return this.nome.compareTo(e.nome);
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
		
		Estado outro = (Estado) obj;
		if (sigla == null) {
			if (outro.sigla != null)
				return false;
		} else if (!sigla.equals(outro.sigla))
			return false;
		return true;		
	}
}
