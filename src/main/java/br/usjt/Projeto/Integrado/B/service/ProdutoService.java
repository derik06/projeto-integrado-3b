package br.usjt.Projeto.Integrado.B.service;

import br.usjt.Projeto.Integrado.B.model.Produto;
import br.usjt.Projeto.Integrado.B.model.repository.IProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService implements IProdutoService {

    private final IProdutoRepository produtoRepo;

    public ProdutoService(IProdutoRepository produtoRepo) {
        this.produtoRepo = produtoRepo;
    }

    @Override
    public List<Produto> findAll() {
        return produtoRepo.findAll();
    }

    @Override
    public void adicionar(Produto produto) {
        produtoRepo.save(produto);
    }

    public Produto getProdutoById(Long id) {
        return produtoRepo.getProdutoById(id);
    }
}