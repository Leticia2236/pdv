package br.com.pdv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.pdv.repository.VendedorRepository;

@Controller

public class VendedorController {
	@Autowired
	private VendedorRepository vendedorRepository;
	
	@GetMapping({"/vedendor"})
	public String home(ModelMap model) {
		model.addAttribute("vendedor", vendedorRepository.findAll());
		return "vendedor";
	}

}
