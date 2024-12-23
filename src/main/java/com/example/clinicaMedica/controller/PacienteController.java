package com.example.clinicaMedica.controller;

import com.example.clinicaMedica.dto.PacienteDTO;
import com.example.clinicaMedica.model.Paciente;
import com.example.clinicaMedica.repository.PacienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("paciente")
public class PacienteController {

    @Autowired
    PacienteRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody @Valid PacienteDTO pacienteDTO){
        repository.save(new Paciente(pacienteDTO));
    }

}
