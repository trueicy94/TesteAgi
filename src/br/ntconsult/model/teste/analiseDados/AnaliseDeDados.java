package br.ntconsult.model.teste.analiseDados;


import java.util.List;

import br.ntconsult.model.teste.tiposDeDados.Cliente;
import br.ntconsult.model.teste.tiposDeDados.Vendas;
import br.ntconsult.model.teste.tiposDeDados.Vendedor;

public class AnaliseDeDados {


	public AnaliseDeDados() {
		
	}
	

	public Integer qtdClientes(String linha, List<Cliente> clientes) {
		
		Cliente cliente = new Cliente (linha);
		clientes.add(cliente);
		return clientes.size();

	}

	public Integer qtdVendedor(String linha, List<Vendedor> vendedores) {
		
		Vendedor vendedor = new Vendedor(linha);
		vendedores.add(vendedor);
		return vendedores.size();
	}

	public Integer idVendaMaisCara(String linha, List<Vendas> vendas, Double maiorValorVenda) {

		int idMaiorVenda = 0;
		Vendas venda = new Vendas(linha);
		vendas.add(venda);
		
		for (Vendas vendas2 : vendas) {
			
			if(vendas2.valorTotalVenda() > maiorValorVenda) {
				maiorValorVenda = vendas2.valorTotalVenda();
				idMaiorVenda = vendas2.getIdVenda();
			}
			
		}

		return idMaiorVenda;
	}

	public String piorVendedor(String linha, List<Vendas> vendas, Double menorVenda) {

		String nomeVendedor = null;
		Double menorValorVenda = 0.0;
		Double valor = 0.0;
		Vendas venda = new Vendas(linha);
		vendas.add(venda);
		
		for (Vendas vendas2 : vendas) {
			
			valor = vendas2.valorTotalVenda();
			nomeVendedor = vendas2.getNomeVendedor();
			
			if(vendas2.valorTotalVenda() < valor) {
				menorValorVenda = vendas2.valorTotalVenda() ;
				nomeVendedor = vendas2.getNomeVendedor();
			} 
		}

		return nomeVendedor;
	}


}