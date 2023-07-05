package com.esmalteria.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esmalteria.app.entity.Servico;
import com.esmalteria.app.repository.ServicoRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value="/servico")
@AllArgsConstructor	
public class ServicoController {

	@Autowired
	private ServicoRepository servicoRepository;

	@GetMapping(value="/detalhes", produces = MediaType.APPLICATION_JSON_VALUE)
	public Integer  findAll() {
		List<Servico> servico = servicoRepository.findAll();
		return 10;

	}


}
