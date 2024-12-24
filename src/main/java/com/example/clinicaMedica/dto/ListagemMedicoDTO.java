package com.example.clinicaMedica.dto;

import com.example.clinicaMedica.model.Especialidade;
import com.example.clinicaMedica.model.Medico;

public record ListagemMedicoDTO (
        String nome,
        String email,
        String crm,
        Especialidade especialidade
){

    public ListagemMedicoDTO (Medico medico){
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
