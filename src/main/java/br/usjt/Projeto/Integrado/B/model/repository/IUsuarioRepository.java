package br.usjt.Projeto.Integrado.B.model.repository;

import br.usjt.Projeto.Integrado.B.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Long>{

    Usuario findOneByNomeAndSenha (String nome, String senha);

    @Query(value = "SELECT u FROM Usuario u WHERE u.nome = ?1")
    Usuario findByNomeQuery(String nome);

    boolean existsByNome(String nome);
}
