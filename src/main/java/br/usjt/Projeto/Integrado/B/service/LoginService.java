package br.usjt.Projeto.Integrado.B.service;

import br.usjt.Projeto.Integrado.B.model.Produto;
import br.usjt.Projeto.Integrado.B.model.Usuario;
import br.usjt.Projeto.Integrado.B.model.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService implements IProdutoService{

    @Autowired
    private IUsuarioRepository usuarioRepo;

    public boolean logar (Usuario usuario) {
        return usuarioRepo.findOneByNomeAndSenha(usuario.getNome(), usuario.getSenha()) != null;
    }

    @Override
    public List<Produto> findAll() {
        return null;
    }

    @Override
    public void adicionar(Produto produto) {

    }

    @Override
    public List<Produto> buscaPorCategoria(String categoria) {
        return null;
    }
}
