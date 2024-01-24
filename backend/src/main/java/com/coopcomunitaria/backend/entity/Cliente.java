package com.coopcomunitaria.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "clientes")
public class Cliente {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_cliente;
	private String nome_cliente;
	private String cpf;
	private int telefone_cliente;
	private String email_cliente;
	private String senha_cliente;
    
}
