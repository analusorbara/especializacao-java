package service;

import entity.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EnderecoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository repository;

    public void salvar(Endereco departamento) {
        repository.save(departamento);
    }

    public Optional<Endereco> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public List<Endereco> buscarTodos() {
        return repository.findAll();
    }
}
