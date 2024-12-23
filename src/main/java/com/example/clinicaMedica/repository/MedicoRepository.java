package com.example.clinicaMedica.repository;

import com.example.clinicaMedica.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
