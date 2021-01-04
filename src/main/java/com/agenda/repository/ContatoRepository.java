package com.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenda.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {

}
