package br.ntconsult.model.teste.tiposDeDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vendedor {
	
	private String id;
	private String cpf;
	private String nome;
	private String salario;
	private List<Vendas> vendas = new ArrayList<>();
	
	
	
	public Vendedor(String linha) {
		
		Scanner scannerSereal = new Scanner(linha);
		Scanner teste =scannerSereal.useDelimiter("ç");
		
		this.id = scannerSereal.next();
		this.cpf= scannerSereal.next();
		this.nome = scannerSereal.next();
		this.salario = scannerSereal.next();
	}
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	public Double totalVendaPorFunc() {
		Double totalVendaPorFunc = null;
		for (Vendas vendas2 : vendas) {
			if (getNome().equals(vendas2.getNomeVendedor())) {
				totalVendaPorFunc =vendas2.valorTotalVenda() + totalVendaPorFunc;
			}
			return totalVendaPorFunc;
		}
		return totalVendaPorFunc;
	}
	

}
