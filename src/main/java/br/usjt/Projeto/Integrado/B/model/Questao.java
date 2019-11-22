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
    public Long id;
	public String pergunta;
	public char alternativaCorreta;
}
