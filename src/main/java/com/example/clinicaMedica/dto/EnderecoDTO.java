package com.example.clinicaMedica.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record EnderecoDTO (
        @NotNull
        String logradouro,
        @NotNull
        String bairro,
        @NotNull
        @Pattern(regexp = "\\d{8}")
        String cep,
        String complemento,
        String numero,
        @NotNull
        String uf,
        @NotNull
        String cidade
){
}
