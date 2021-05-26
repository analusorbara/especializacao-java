package edu.utfpr.javadb.controller;

import edu.utfpr.javadb.entity.Cargo;
import edu.utfpr.javadb.entity.Contato;
import edu.utfpr.javadb.entity.Funcionario;
import edu.utfpr.javadb.service.ContatoService;
import edu.utfpr.javadb.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ContatoController {
    @Autowired
    private FuncionarioService funcionarioService;
    private final ContatoService service;

    public ContatoController(ContatoService service) {
        this.service = service;
    }

    @GetMapping("/contatos")
    @ResponseBody
    public List<Contato> sayHello() {
        return service.buscarTodos();
    }

    @GetMapping("/cargo")
    public void criarCargoNovo() {
        funcionarioService.criarCargo("estudante");
    }

    @GetMapping("/funcionario")
    public void criarFuncionarioNovo() {
        funcionarioService.criarFuncionario("Analu", "F", "5555-5555", "estudante");
    }

    @GetMapping("/deletar")
    public void deletarTudo() {
        funcionarioService.deletarFuncionario(6L);
        funcionarioService.deletarCargo(5L);
    }

    @GetMapping("/listfunc")
    @ResponseBody
    public long funcionarios() {
        return funcionarioService.totalFuncionarios();
    }

    @GetMapping("/listcargos")
    @ResponseBody
    public List<Cargo> cargos() {
        return funcionarioService.cargos();
    }
}
