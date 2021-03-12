package service;

import entity.Contato;
import entity.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.ContatoRepository;
import repository.EnderecoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ContatoRepository contatoRepository;

    public void salvar(Endereco departamento) {
        enderecoRepository.save(departamento);
    }

    public Optional<Endereco> buscarPorId(Long id) {
        return enderecoRepository.findById(id);
    }

    public void deletar(Long id) {
        enderecoRepository.deleteById(id);
    }

    public List<Endereco> buscarTodos() {
        return enderecoRepository.findAll();
    }

    @Transactional(readOnly = false)
    public void salvar(Endereco endereco, Contato contato){
        enderecoRepository.save(endereco);
        contato.setEndereco(endereco);
        contatoRepository.save(contato);
    }
}
