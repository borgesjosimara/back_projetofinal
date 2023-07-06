package com.esmalteria.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esmalteria.app.entity.Servico;
import com.esmalteria.app.repository.ServicoRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "/api/servicos")

public class ServicoController {

	@Autowired
	private ServicoRepository servicoRepository;

	@GetMapping
	public List<Servico> listar() {
		return servicoRepository.findAll();
	}

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Servico buscarPorId(Long id) {
		return servicoRepository.findById(id).get();
	}

	@PostMapping
	public Servico cadastrar(@RequestBody Servico servico) {
		return servicoRepository.save(servico);
	}

	@DeleteMapping(value = "/{id}")
	public void deletar(@PathVariable Long id) {
		servicoRepository.deleteById(id);
	}

	@PostMapping(value = "/{id}")
	public Servico atualizar(@PathVariable Long id, @RequestBody Servico servico) {
		servico.setId(id);
		return servicoRepository.save(servico);
	}

	/*
	 * # buscar por id
	 * 
	 * 
	 * # cadastrar
	 * 
	 * # deletar
	 */

}
