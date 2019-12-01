package br.usjt.Projeto.Integrado.B.service;

import br.usjt.Projeto.Integrado.B.model.Usuario;
import br.usjt.Projeto.Integrado.B.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService{

    @Autowired
    private UsuarioRepository usuarioRepo;

    public Usuario logar (Usuario usuario) {
        return usuarioRepo.findOneByNomeAndSenha(usuario.getNome(), usuario.getSenha());
    }
    
    public String verificarPermissao(Usuario usuario) {
        return usuarioRepo.findByNomeQuery(usuario.getNome()).getPermissao();
    }
}
