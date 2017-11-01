package br.com.alura.loja.modelo;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

public class Projeto {
	private String nome;
	private Long id;
	private int anoInicio;

	public Projeto() {

	}

	public Projeto(Long id, String nome, int anoInicio) {
		this.id = id;
		this.nome = nome;
		this.anoInicio = anoInicio;
	}

	public String getNome() {
		return nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAnoInicio() {
		return anoInicio;
	}

	public String toXML() {
		return new XStream().toXML(this);
	}

	public String toJson() {
		return new Gson().toJson(this);
	}

}
