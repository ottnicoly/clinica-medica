package com.example.clinicaMedica.model;

import com.example.clinicaMedica.dto.EnderecoDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@AllArgsConstructor
public class Endereco {

    @Column(nullable = false)
    private String logradouro;
    private String bairro;
    private String cep;
    private String complemento;
    private String numero;
    private String uf;
    private String cidade;

    public Endereco(){

    }

    public Endereco(EnderecoDTO enderecoDTO) {
        this.logradouro = enderecoDTO.logradouro();
        this.bairro = enderecoDTO.bairro();
        this.cep = enderecoDTO.cep();
        this.complemento = enderecoDTO.complemento();
        this.numero = enderecoDTO.numero();
        this.uf = enderecoDTO.uf();
        this.cidade = enderecoDTO.cidade();
    }

}
