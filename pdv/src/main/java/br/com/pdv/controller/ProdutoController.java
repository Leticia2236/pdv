package br.com.pdv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.pdv.repository.ProdutoRepository;

@Controller

public class ProdutoController {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping({"/produto"})
	public String home(ModelMap model) {
		model.addAttribute("produto", produtoRepository.findAll());
		return "produto";
	}

}

