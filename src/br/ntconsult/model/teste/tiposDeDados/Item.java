package br.ntconsult.model.teste.tiposDeDados;

public class Item {
	
	private int idItem ;
	private int qtdItem;
	private Double valorItem;
	private Double valorTotalItem;
	
	public Item(String[] dados) {

		this.setIdItem(Integer.valueOf(dados[0]));
		this.setQtdItem(Integer.valueOf(dados[1]));
		this.setValorItem(Double.valueOf(dados[2]));
	}

	public int getIdItem() {
		return idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	public int getQtdItem() {
		return qtdItem;
	}

	public void setQtdItem(int qtdItem) {
		this.qtdItem = qtdItem;
	}

	public Double getValorItem() {
		return valorItem;
	}

	public void setValorItem(Double valorItem) {
		this.valorItem = valorItem;
	}

	public Double getValorTotalItem() {
		
		valorTotalItem = getQtdItem() * getValorItem();
		return valorTotalItem;
		
	}
	


}
