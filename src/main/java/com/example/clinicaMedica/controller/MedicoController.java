package com.example.clinicaMedica.controller;

import com.example.clinicaMedica.dto.ListagemMedicoDTO;
import com.example.clinicaMedica.dto.MedicoDTO;
import com.example.clinicaMedica.model.Medico;
import com.example.clinicaMedica.repository.MedicoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medico")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid MedicoDTO medicoDTO){
        repository.save(new Medico(medicoDTO));
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public Page<ListagemMedicoDTO> listar(@PageableDefault(size=10, sort = {"nome"}) Pageable paginacao){
        return repository.findAll(paginacao).map(ListagemMedicoDTO::new);
    }

}
