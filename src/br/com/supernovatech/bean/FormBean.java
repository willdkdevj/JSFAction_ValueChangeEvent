package br.com.supernovatech.bean;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;

import br.com.supernovatech.business.ContinenteProvider;
import br.com.supernovatech.model.Continente;
import br.com.supernovatech.model.Estado;
import br.com.supernovatech.model.Pais;
import br.com.supernovatech.model.Regiao;

@Named("form")
@SessionScoped
public class FormBean implements Serializable{
	
	private Collection<Continente> continentes;
	private Collection<Pais> paises;
	private Collection<Regiao> regioes;
	private Collection<Estado> estados;
	private String siglaContinente, siglaPais, siglaRegiao, siglaEstado;
	
	@PostConstruct
	public void inicio() {
		continentes = ContinenteProvider.getContinentes();
	}
	
	public void carregarPaises(ActionEvent evento) {
		this.paises = ContinenteProvider.getPaises(siglaContinente);
	}
	
	public void carregarRegioes(ValueChangeEvent evento) {
		this.regioes = ContinenteProvider.getRegioes(evento.getNewValue().toString());
	}
	
	public void carregarEstados(ValueChangeEvent evento) {
		this.estados = ContinenteProvider.getEstados((String) evento.getNewValue()); 
	}
	
	public Collection<Continente> getContinentes() {
		return continentes;
	}

	public void setContinentes(Collection<Continente> continentes) {
		this.continentes = continentes;
	}

	public Collection<Pais> getPaises() {
		return paises;
	}

	public void setPaises(Collection<Pais> paises) {
		this.paises = paises;
	}

	public Collection<Regiao> getRegioes() {
		return regioes;
	}
	
	public void setRegioes(Collection<Regiao> regioes) {
		this.regioes = regioes;
	}
	
	public Collection<Estado> getEstados() {
		return estados;
	}
	
	public void setEstados(Collection<Estado> estados) {
		this.estados = estados;
	}
	
	public String getSiglaRegiao() {
		return siglaRegiao;
	}
	
	public void setSiglaRegiao(String siglaRegiao) {
		this.siglaRegiao = siglaRegiao;
	}
	
	public String getSiglaEstado() {
		return siglaEstado;
	}
	
	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}

	public String getSiglaPais() {
		return siglaPais;
	}

	public void setSiglaPais(String siglaPais) {
		this.siglaPais = siglaPais;
	}
	
	public String getSiglaContinente() {
		return this.siglaContinente;
	}
	
	public void setSiglaContinente(String sigla) {
		this.siglaContinente = sigla;
	}
}
