package br.usjt.Projeto.Integrado.B.controller;

import br.usjt.Projeto.Integrado.B.model.Usuario;
import br.usjt.Projeto.Integrado.B.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping(value = {"login"})
    public ModelAndView login () {
        ModelAndView mv = new ModelAndView ("login");
        mv.addObject(new Usuario());
        return mv;
    }

    @PostMapping({"/login"})
    public String fazerLogin (HttpServletRequest request, Usuario usuario, Model model) {
            if (loginService.logar(usuario)) {
            return "redirect:/";
        } else {
            model.addAttribute("erroLogin", "erroLogin");
            return "login";
        }
    }
}
