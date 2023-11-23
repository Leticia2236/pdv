package br.com.pdv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.pdv.repository.VendasRepository;

@Controller

public class VendasController {
	@Autowired
	private VendasRepository vendasRepository;
	
	@GetMapping({"/vendas"})
	public String home(ModelMap model) {
		model.addAttribute("vendas", vendasRepository.findAll());
		return "vendas";
	}

}

