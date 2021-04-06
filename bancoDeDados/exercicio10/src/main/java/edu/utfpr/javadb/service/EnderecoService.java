package edu.utfpr.javadb.service;

import edu.utfpr.javadb.entity.Contato;
import edu.utfpr.javadb.entity.Endereco;
import edu.utfpr.javadb.repository.ContatoRepository;
import edu.utfpr.javadb.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {
    private final EnderecoRepository enderecoRepository;
    private final ContatoRepository contatoRepository;

    public EnderecoService(EnderecoRepository enderecoRepository, ContatoRepository contatoRepository) {
        this.enderecoRepository = enderecoRepository;
        this.contatoRepository = contatoRepository;
    }

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
