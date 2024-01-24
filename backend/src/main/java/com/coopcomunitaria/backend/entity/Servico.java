/*package com.coopcomunitaria.backend.entity;

@Entity
@Table(name = "Servico")
public class ServicoModel {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_servico;
	private String nome_do_servico;
	private String categoria;
	private double preco;
	
	
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private ClienteModel c1;
	
	@ManyToOne
	@JoinColumn(name = "id_empresa")
	private EmpresaModel e1;
	
}*/
