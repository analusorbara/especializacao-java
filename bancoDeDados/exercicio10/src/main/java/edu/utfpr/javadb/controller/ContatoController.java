package edu.utfpr.javadb.controller;

import edu.utfpr.javadb.entity.Contato;
import edu.utfpr.javadb.service.ContatoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ContatoController {
    private final ContatoService service;

    public ContatoController(ContatoService service) {
        this.service = service;
    }

    @GetMapping("/contatos")
    @ResponseBody
    public List<Contato> sayHello() {
        return service.buscarTodos();
    }
}
