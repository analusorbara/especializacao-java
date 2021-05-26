package edu.utfpr.javadb.controller;

import edu.utfpr.javadb.entity.Cargo;
import edu.utfpr.javadb.entity.Funcionario;
import edu.utfpr.javadb.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.logging.LogLevel;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

@Configuration
public class Questao10 implements CommandLineRunner {
    @Autowired
    FuncionarioService funcionarioService;

    Logger logger = Logger.getLogger("my.logger");

    @Override
    public void run(String... args) throws Exception {
        logger.setLevel(Level.ALL);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(new SimpleFormatter());
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);

        // Listar Funcionários com os seus respectivos Cargos;
        List<Funcionario> funcionarios = funcionarioService.funcionarios();
        funcionarios.forEach(item -> {
            String itemStr = item.getIdFuncPk().toString() + " " + item.getNome() + " " + item.getSexo() + " " + item.getTelefone() + " " + item.getCargo().getCargo();
            logger.fine(itemStr);
        });

        // Listar Cargos com a respectiva lista de Funcionários;
        List<Cargo> cargos = funcionarioService.cargos();
        cargos.forEach(item -> {
            String itemStr;
            if (item.getFuncionario() != null) {
                itemStr = item.getIdCargoPK().toString() + " " + item.getCargo() + " " + item.getFuncionario().getNome();
            } else {
                itemStr = item.getIdCargoPK().toString() + " " + item.getCargo() + " " + item.getFuncionario();
            }
            logger.fine(itemStr);
        });

        // Listar o Nome de Funcionários em Ordem Alfabética; e
        List<String> funcionariosNome = funcionarioService.funcionariosNomes();
        funcionariosNome.forEach(item -> {
            logger.fine(item);
        });

        // Listar a Quantidade de Funcionários.
        logger.fine(String.valueOf(funcionarioService.totalFuncionarios()));
    }
}
