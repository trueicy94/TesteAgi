package br.ntconsult.model.teste.tiposDeDados;

import java.util.Scanner;

public class Cliente {
	
	private String id;
	private String cnpj;
	private String nome;
	private String profissao;
	
	
	
	public Cliente() {
	}



	public Cliente(String linha) {
		
		Scanner scannerSereal = new Scanner(linha);
		Scanner teste =scannerSereal.useDelimiter("ç");
		
		this.id = scannerSereal.next();
		this.cnpj = scannerSereal.next();
		this.nome = scannerSereal.next();
		this.profissao = scannerSereal.next();
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getCnpj() {
		return cnpj;
	}



	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getProfissao() {
		return profissao;
	}



	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
	
	

}
