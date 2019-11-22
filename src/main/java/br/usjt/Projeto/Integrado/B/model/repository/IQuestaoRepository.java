package br.usjt.Projeto.Integrado.B.model.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.usjt.Projeto.Integrado.B.model.Produto;
import br.usjt.Projeto.Integrado.B.model.Questao;

@Repository
@Transactional
public interface IQuestaoRepository extends JpaRepository<Questao, Long>{
	
}
