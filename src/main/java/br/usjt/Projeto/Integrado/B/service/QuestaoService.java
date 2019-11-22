package br.usjt.Projeto.Integrado.B.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.Projeto.Integrado.B.model.Questao;
import br.usjt.Projeto.Integrado.B.model.repository.IQuestaoRepository;

@Service
public class QuestaoService {

	@Autowired
	IQuestaoRepository repo;
	
	public Questao BuscarQuestao(Long id) {
		return repo.findById(id).get();
	}
	
	public void i() {
		Questao q = new Questao();
		q.pergunta = "Qual é o meu nome? a)Vinicius b)Derik";
		q.alternativaCorreta = 'a';
		
		repo.save(q);
	}
}
