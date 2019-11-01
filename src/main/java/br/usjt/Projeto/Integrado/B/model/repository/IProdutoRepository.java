package br.usjt.Projeto.Integrado.B.model.repository;

import br.usjt.Projeto.Integrado.B.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface IProdutoRepository extends JpaRepository<Produto, Long> {

    Produto getProdutoById(Long id);

    @Query("SELECT p FROM Produto p WHERE p.categoria = ?1")
    public List<Produto> buscaPorCategoria(String categoria);
}