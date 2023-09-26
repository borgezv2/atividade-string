package com.andre22.andre.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andre22.andre.entities.Cliente;
import com.andre22.andre.repositories.Repository;
@Service
public class service {

	private Repository clienteRepository;
	
	@Autowired
	public void ClienteService(Repository clienteRepository) {
	 this.clienteRepository = clienteRepository;
	}
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	public Cliente getClienteById(Long id) {
		return clienteRepository.findById(id).orElse(null);
	}
	public List<Cliente> getAllCliente() {
		return clienteRepository.findAll();
	}
	public void deleteCliente(Long id) {
		clienteRepository.deleteById(id);
	}
}
