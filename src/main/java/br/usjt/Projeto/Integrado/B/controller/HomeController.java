package br.usjt.Projeto.Integrado.B.controller;

import br.usjt.Projeto.Integrado.B.model.Produto;
import br.usjt.Projeto.Integrado.B.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping(value = {"/home", "/"})
    public ModelAndView listaProduto() {
        ModelAndView mv = new ModelAndView("home");
        List<Produto> produtos = produtoService.findAll();
        mv.addObject("produtos", produtos);
        mv.addObject(new Produto());
        return mv;
    }

    @GetMapping("/busca_categoria/{categoria}")
    public ModelAndView buscaPorCategoria(@PathVariable String categoria) {
        ModelAndView mv = new ModelAndView("home");
        mv.addObject(new Produto());
        List<Produto> produtos = produtoService.buscaPorCategoria(categoria);
        mv.addObject("produtos", produtos);
        return mv;
    }
}