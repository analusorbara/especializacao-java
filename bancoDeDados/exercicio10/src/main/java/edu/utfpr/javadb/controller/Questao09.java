package edu.utfpr.javadb.controller;

import edu.utfpr.javadb.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Questao09 implements CommandLineRunner {
    @Autowired
    FuncionarioService funcionarioService;

    @Override
    public void run(String... args) throws Exception {
//        funcionarioService.criarCargo("TI");
//        funcionarioService.criarCargo("Vendas");
//        funcionarioService.criarCargo("RH");
//
//        funcionarioService.criarFuncionario("Analu", "F", "1111-1111", "TI");
//        funcionarioService.criarFuncionario("Jose", "M", "2222-2222", "Vendas");
//        funcionarioService.criarFuncionario("Carla", "F", "2222-2222", "RH");
//
//        funcionarioService.deletarCargo(1L);
//        funcionarioService.deletarFuncionario(1L);
    }
}
