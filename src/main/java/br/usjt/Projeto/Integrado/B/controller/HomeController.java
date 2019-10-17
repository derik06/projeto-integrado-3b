package br.usjt.Projeto.Integrado.B.controller;

import br.usjt.Projeto.Integrado.B.model.Produto;
import br.usjt.Projeto.Integrado.B.service.IProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    IProdutoService produtoService;

    @GetMapping(value = {"/home", "/"})
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView("home");
        List<Produto> produtos = produtoService.findAll();
        mv.addObject("produtos", produtos);
        mv.addObject(new Produto());
        return mv;
    }
}