package br.ntconsult.model.teste.tiposDeDados;

public class Relatorio {
	
	private int numFuncionario;
	
	private int qtdVendedores;
	private int qtdClientes;
	private int idMaiorValorVenda;
	private String nomeVendedor;
	
	
	
	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public int getNumFuncionario() {
		return numFuncionario;
	}

	public void setNumFuncionario(int numFuncionario) {
		this.numFuncionario = numFuncionario;
	}

	public int getQtdVendedores() {
		return qtdVendedores;
	}

	public void setQtdVendedores(int qtdVendedores) {
		this.qtdVendedores = qtdVendedores;
	}

	public int getQtdClientes() {
		return qtdClientes;
	}

	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}


	public int getIdMaiorValorVenda() {
		return idMaiorValorVenda;
	}

	public void setIdMaiorValorVenda(int idMaiorValorVenda) {
		this.idMaiorValorVenda = idMaiorValorVenda;
	}

	public Relatorio() {
		super();
	}
	
	
	
	
	

}
