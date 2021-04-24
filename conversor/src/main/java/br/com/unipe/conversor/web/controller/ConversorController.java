package br.com.unipe.conversor.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.unipe.conversor.model.Moeda;

@Controller
public class ConversorController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView get(Model model){
		model.addAttribute("moeda", new Moeda());
		return new ModelAndView("main");
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ModelAndView calcula(@ModelAttribute Moeda moeda) {
		ModelAndView view = new ModelAndView("main");
		
		view.addObject("mensagem", "O Valor de $ "+ moeda.getValor()+ " equivale a R$ " + moeda.converter());
		
		return view;
	}
}
