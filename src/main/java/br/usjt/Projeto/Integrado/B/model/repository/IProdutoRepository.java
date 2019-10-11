package br.usjt.ccp3bn_mca_projeto_integrado.model.repository;

import br.usjt.ccp3bn_mca_projeto_integrado.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IProdutoRepository extends JpaRepository<Produto, Long> {

}