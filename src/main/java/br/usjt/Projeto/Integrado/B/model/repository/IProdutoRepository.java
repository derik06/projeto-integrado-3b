package br.usjt.Projeto.Integrado.B.model.repository;

import br.usjt.Projeto.Integrado.B.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IProdutoRepository extends JpaRepository<Produto, Long> {

    Produto getProdutoById(Long id);
}