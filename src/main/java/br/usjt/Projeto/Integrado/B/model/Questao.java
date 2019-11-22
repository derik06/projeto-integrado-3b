package br.usjt.Projeto.Integrado.B.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Questao {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String pergunta;
	private char alternativaCorreta;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	public char getAlternativaCorreta() {
		return alternativaCorreta;
	}
	public void setAlternativaCorreta(char alternativaCorreta) {
		this.alternativaCorreta = alternativaCorreta;
	}
}
