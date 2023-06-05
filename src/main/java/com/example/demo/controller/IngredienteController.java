package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.pojo.Ingrediente;
import com.example.demo.serv.IngredienteServ;

@Controller
public class IngredienteController {
	
	@Autowired
	private IngredienteServ ingredienteServ;

	
	@GetMapping("/ingredienti")
	public String ingredientiShow(Model model) {
	
		List<Ingrediente> ingredienti = ingredienteServ.findAll();
		
		model.addAttribute("ingredienti", ingredienti);
		
		return "IngredienteShow";
	}
}
