package com.example.clinicaMedica.dto;

public record PacienteDTO(
        Long id,
        String nome,
        String email,
        String telefone,
        String cpf,
        EnderecoDTO endereco
) {
}
