package br.usjt.ccp3bn_mca_projeto_integrado.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping (value = {"/home", "/"})
    public ModelAndView login () {
        return new ModelAndView ("home");
    }
}