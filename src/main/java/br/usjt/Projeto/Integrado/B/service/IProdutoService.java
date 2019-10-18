package br.usjt.Projeto.Integrado.B.service;

import br.usjt.Projeto.Integrado.B.model.Produto;

import java.util.List;

public interface IProdutoService {
    public List<Produto> findAll();

    public void adicionar(Produto produto);
}
