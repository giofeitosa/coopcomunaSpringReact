package com.coopcomunitaria.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coopcomunitaria.backend.entity.Cliente;
import com.coopcomunitaria.backend.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    
    public List<Cliente> listarCliente(){

        return clienteRepository.findAll();

    }

   
    public Cliente save(Cliente cliente){

        Cliente clienteNovo = clienteRepository.saveAndFlush(cliente);
        return clienteNovo;

    }
    
    public Cliente upDate(Cliente cliente){
        return clienteRepository.saveAndFlush(cliente);

    }

    public void  delete(Long id){

        Cliente cliente = clienteRepository.findById(id).get();
        clienteRepository.delete(cliente);

    }




    
}
