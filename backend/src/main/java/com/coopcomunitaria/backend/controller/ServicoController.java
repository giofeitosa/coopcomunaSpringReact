/*package br.org.com.recode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.org.com.recode.model.ServicoModel;
import br.org.com.recode.repository.ClienteRepository;
import br.org.com.recode.repository.ServicoRepository;
import br.org.com.recode.repository.EmpresaRepository;

@Controller
@RequestMapping("/servico")
public class ServicoController {
	
	
	@Autowired
	private ServicoRepository servicoRepository;
	
	 @Autowired
	    private EmpresaRepository empresaRepository; 
	    @Autowired
	    private ClienteRepository clienteRepository; 
	
	@GetMapping
	public ModelAndView servico() {
		ModelAndView modelAndView = new ModelAndView ("views/servico/index.html");
		modelAndView.addObject("servicos",servicoRepository.findAll());
		modelAndView.addObject("empresas", empresaRepository.findAll()); 
        modelAndView.addObject("clientes", clienteRepository.findAll()); 
		
		modelAndView.addObject("servico", new ServicoModel());

		return modelAndView;
		
	}
	
	
	@PostMapping("/cadastrar")
	
	public String cadastrar(@ModelAttribute("servico") ServicoModel servico) {

		
        servicoRepository.save(servico);

        
		return "redirect:/servico";
	}
	
	
	@GetMapping("/{id_servico}/excluir")
	public String excluir(@PathVariable Long id_servico) {
		servicoRepository.deleteById(id_servico);

		return "redirect:/servico";
	}
	

	}*/