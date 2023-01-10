package com.grotto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grotto.model.Contatto;

@RestController
public class ServiceRestController {
	@RequestMapping("test")
	public List<Contatto> ServiceTest() {
		List<Contatto> lista = new ArrayList<Contatto>();
		lista.add(new Contatto("Mario", "Rossi", "mario"));
		lista.add(new Contatto("Pino", "Rosso", "lol"));
		lista.add(new Contatto("Marco", "Rossu", "red"));
		return lista;
	}
}