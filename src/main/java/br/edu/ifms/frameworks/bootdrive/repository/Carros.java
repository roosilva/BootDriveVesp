package br.edu.ifms.frameworks.bootdrive.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifms.frameworks.bootdrive.model.Carro;

public interface Carros extends JpaRepository<Carro, Long> {
}