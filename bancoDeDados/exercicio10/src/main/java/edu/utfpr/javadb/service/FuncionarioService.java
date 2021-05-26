package edu.utfpr.javadb.service;

import edu.utfpr.javadb.entity.Cargo;
import edu.utfpr.javadb.entity.Funcionario;
import edu.utfpr.javadb.repository.CargoRepository;
import edu.utfpr.javadb.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    private CargoRepository cargoRepository;

    public Cargo criarCargo(String cargo) {
        Optional<Cargo> cargoOp = cargoRepository.findFirstByCargo(cargo);
        if (cargoOp.isEmpty()) {
            Cargo cargoObj = new Cargo();
            cargoObj.setCargo(cargo);
            cargoRepository.save(cargoObj);
            return cargoObj;
        }
        return cargoOp.get();
    }

    public void criarFuncionario(String nome, String sexo, String telefone, String cargo) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(nome);
        funcionario.setSexo(sexo);
        funcionario.setTelefone(telefone);
        funcionario.setCargo(criarCargo(cargo));

        funcionarioRepository.save(funcionario);
    }

    public void deletarFuncionario(Long id) {
        Optional<Funcionario> funcionarioOp = funcionarioRepository.findFirstByIdFuncPk(id);
        if (funcionarioOp.isPresent()) {
            funcionarioRepository.delete(funcionarioOp.get());
        }
    }

    public void deletarCargo(Long id) {
        Optional<Cargo> cargoOp = cargoRepository.findCargoByIdCargoPK(id);
        if (cargoOp.isPresent()) {
            cargoRepository.delete(cargoOp.get());
        }
    }

    public List<Funcionario> funcionarios() {
        return funcionarioRepository.findAll();
    }

    public List<Cargo> cargos() {
        return cargoRepository.findAll();
    }

    public List<String> funcionariosNomes() {
        return funcionarioRepository.funcionariosNome();
    }

    public long totalFuncionarios() {
        return funcionarioRepository.count();
    }
}
