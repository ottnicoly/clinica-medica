package com.example.clinicaMedica.dto;

import com.example.clinicaMedica.model.Endereco;
import com.example.clinicaMedica.model.Especialidade;
import com.example.clinicaMedica.model.Medico;

public record MedicoDTO (
        Long id,
        String nome,
        String email,
        String telefone,
        String crm,
        Especialidade especialidade,
        EnderecoDTO endereco
){

}
