package edu.utfpr.javadb.interfaces;

import org.springframework.beans.factory.annotation.Value;

public interface NomeCidade {
    String getNome();

    @Value("#{(target.endereco.cidade)}")
    String getCidade();

    @Value("#{target.firstName} #{target.lastName}")
    String getFullName();
}
