package br.usjt.Projeto.Integrado.B.service;

import br.usjt.Projeto.Integrado.B.model.Usuario;
import br.usjt.Projeto.Integrado.B.model.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private IUsuarioRepository usuarioRepo;

    public boolean logar (Usuario usuario) {
        return usuarioRepo.findOneByNomeAndSenha(usuario.getNome(), usuario.getSenha()) != null;
    }
}
