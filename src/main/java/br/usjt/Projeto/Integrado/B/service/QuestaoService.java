package br.usjt.Projeto.Integrado.B.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.Projeto.Integrado.B.model.Questao;
import br.usjt.Projeto.Integrado.B.model.repository.IQuestaoRepository;

@Service
public class QuestaoService {

	@Autowired
	IQuestaoRepository repo;
	
	public Questao buscarQuestao(Long id) {
		try {
			return repo.findById(id).get();
		}
		catch(Exception e){
			return null;
		}
	}
	
	public Boolean questaoCorreta(Questao questaoRespondida) {
		Questao questaoOriginal = buscarQuestao(questaoRespondida.getId());
		
		return questaoRespondida.getAlternativaCorreta() == questaoOriginal.getAlternativaCorreta();
	}
}
