package com.example.clinicaMedica.repository;

import com.example.clinicaMedica.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
