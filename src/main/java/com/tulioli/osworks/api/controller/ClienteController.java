package com.tulioli.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tulioli.osworks.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Crispim");
		cliente1.setEmail("crispim@gmail.com");
		cliente1.setTelefone("16 9999-5656");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Rufus");
		cliente2.setEmail("rufus@hotmail.com");
		cliente2.setTelefone("34 5262-5454");
		
		return Arrays.asList(cliente1, cliente2);
	}
}
