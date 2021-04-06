package edu.utfpr.javadb.service;

import edu.utfpr.javadb.entity.Contato;
import edu.utfpr.javadb.repository.ContatoRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContatoService {
    private final ContatoRepository repository;

    public ContatoService(ContatoRepository repository) {
        this.repository = repository;
    }

    public void salvar(Contato contato) {
        repository.save(contato);
    }

    public Optional<Contato> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public List<Contato> buscarTodos() {
        return repository.findAll();
    }

    public List<Contato> buscarPoridadeQBE(Integer idade){
        Contato contato = new Contato();
        contato.setIdade(idade);
        Example<Contato> example = Example.of(contato);

        return repository.findAll(example);
    }

    public List<Contato> buscarPorNomeQBE(String nome) {
        Contato contato = new Contato();
        contato.setNome(nome);

        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.ENDING);

        Example<Contato> example = Example.of(contato, matcher);

        return repository.findAll(example);
    }

    public List<Contato>buscarTodosPorIdadeAsc(){
        return repository.findAll(Sort.by(Sort.Direction.ASC, "idade"));
    }
}
