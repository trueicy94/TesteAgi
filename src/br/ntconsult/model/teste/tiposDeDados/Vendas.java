package br.ntconsult.model.teste.tiposDeDados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Vendas {

	private Integer id;
	private Integer idVenda;
	private String venda;
	private List<Item> itens= new ArrayList<>();
	private String nomeVendedor;

	public Vendas(String linha) {

		Scanner scannerSereal = new Scanner(linha);
		Scanner teste =scannerSereal.useDelimiter("ç");

		this.id = Integer.parseInt(scannerSereal.next());
		this.idVenda = Integer.parseInt(scannerSereal.next());
		this.venda = scannerSereal.next();
		this.nomeVendedor = scannerSereal.next();
		this.itens = listandoItens();
	}

	public Integer getId() {
		
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(Integer idVenda) {
		this.idVenda = idVenda;
	}

	public String getVenda() {
		return venda;
	}

	public void setVenda(String venda) {
		this.venda = venda;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public List<Item> listandoItens() {

		String venda = getVenda();

		String[] itensSeparados = venda.replaceAll("\\[", "")
				.replaceAll("]", "").split(",");

		ArrayList<String> list = new ArrayList<String>(Arrays.asList(itensSeparados));

		for (String string : list) {

			String[] dados = string.split("-");
			Item item = new Item(dados);
			itens.add(item);

		}
		return itens;
	}

	public void getItens(List<Item> itens) {
		this.itens = itens;
	}

	public Double valorTotalVenda () {
		
		Double valorTotalVenda = 0.0;
		for (Item item : itens) {
			Double valorDoItem = item.getValorTotalItem();
			valorTotalVenda= valorTotalVenda + valorDoItem;
		}
		return valorTotalVenda;
	}
	
	
	

}
