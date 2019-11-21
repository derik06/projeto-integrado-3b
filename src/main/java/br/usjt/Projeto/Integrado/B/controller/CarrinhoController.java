package br.usjt.Projeto.Integrado.B.controller;

import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.Projeto.Integrado.B.model.Produto;
import br.usjt.Projeto.Integrado.B.service.ProdutoService;

@Controller
public class CarrinhoController {

	private final ProdutoService produtoService;

    public CarrinhoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }
	
	@GetMapping(value="carrinho")
    public ModelAndView visualizar(HttpSession session) {
		ArrayList<Produto> produtos = (ArrayList<Produto>) session.getAttribute("produtos");
        ModelAndView carrinhoMV = new ModelAndView("carrinho");
        carrinhoMV.addObject("produtos", produtos);
        
        return carrinhoMV;
    }
}
