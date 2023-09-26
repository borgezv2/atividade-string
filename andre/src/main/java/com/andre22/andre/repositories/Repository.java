package com.andre22.andre.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andre22.andre.entities.Cliente;

public interface Repository extends JpaRepository<Cliente, Long> {
	
}