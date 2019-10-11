package br.usjt.Projeto.Integrado.B.model.repository;

import br.usjt.Projeto.Integrado.B.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IPedidoRepository extends JpaRepository<Pedido, Long> {

}