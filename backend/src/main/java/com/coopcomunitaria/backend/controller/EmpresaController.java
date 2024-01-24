/*package br.org.com.recode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.org.com.recode.model.EmpresaModel;
import br.org.com.recode.repository.EmpresaRepository;

@Controller
@RequestMapping("/empresa")
public class EmpresaController {
	
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	@GetMapping
	public ModelAndView empresa() {
		ModelAndView modelAndView = new ModelAndView ("views/empresa/index.html");
		modelAndView.addObject("empresas",empresaRepository.findAll());
		
		modelAndView.addObject("empresa", new EmpresaModel());

		return modelAndView;
		
	}
	
	@PostMapping("/cadastrar")
	public String cadastrar(EmpresaModel empresa) {
		empresaRepository.save(empresa);

		return "redirect:/empresa";
	}
	
	@GetMapping("/{id_empresa}/excluir")
	public String excluir(@PathVariable Long id_empresa) {
		empresaRepository.deleteById(id_empresa);

		return "redirect:/empresa";
	}
	

	}

*/