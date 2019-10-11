package br.usjt.Projeto.Integrado.B.model.repository;

import br.usjt.Projeto.Integrado.B.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

}
