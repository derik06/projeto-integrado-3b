package br.usjt.Projeto.Integrado.B.service;

import br.usjt.Projeto.Integrado.B.model.Produto;
import br.usjt.Projeto.Integrado.B.model.repository.IProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService implements IProdutoService {

    @Autowired
    IProdutoRepository produtoRepo;

    @Override
    public List<Produto> findAll() {
        return produtoRepo.findAll();
    }
}