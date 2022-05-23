package br.ntconsult.model.teste.entradaDados;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.ntconsult.model.teste.analiseDados.AnaliseDeDados;
import br.ntconsult.model.teste.saidaDeDados.SaidaDeDados;
import br.ntconsult.model.teste.tiposDeDados.Cliente;
import br.ntconsult.model.teste.tiposDeDados.Relatorio;
import br.ntconsult.model.teste.tiposDeDados.Vendas;
import br.ntconsult.model.teste.tiposDeDados.Vendedor;

public class EntradaDeDados {

	private String caminhoLeitura = "C:/Users/Admin/Desktop/Agi/in";

	

	private List<Cliente> clientes = new ArrayList<Cliente>();

	private List<Vendas> vendas = new ArrayList<Vendas>();

	private List<Vendedor> vendedores = new ArrayList<Vendedor>();

	private List<String> arquivosLidos = new ArrayList<String>();

	private AnaliseDeDados analise = new AnaliseDeDados();

	Relatorio relatorio = new Relatorio();
	

	public EntradaDeDados() {
	}

	public List<String> pegaArquivotxt() {

		File file = new File(caminhoLeitura);
		List<String> nomesArquivos = new ArrayList<>();
		for (var nome : file.list()) {
			if (nome.contains(".txt") && !arquivosLidos.contains(nome)) {
				nomesArquivos.add(nome);
				arquivosLidos.add(nome);
			}
		}

		return nomesArquivos;

	}

	public Relatorio listaELeArquivos(String nomeArquivos, List<String> nomesArquivos ) throws FileNotFoundException {
		
		int i2 = 0;
		for (int j = nomesArquivos.size(); i2 < j; i2++) {

			Scanner scanner = new Scanner(new File(caminhoLeitura + "/" + nomesArquivos.get(i2)));
			
			clientes = new ArrayList<>();
			vendas = new ArrayList<>();
			vendedores = new ArrayList<>();
			
			Double maiorValorVenda = 0.0;
			int qtdVendedores = 0;
			int qtdCliente = 0;
			Double menorValorVenda = 0.0;

			int idVendaMaisCara = 0;

			while (scanner.hasNextLine()) {

				String linha = scanner.nextLine();

				Scanner scannerSereal = new Scanner(linha);
				Scanner teste = scannerSereal.useDelimiter("ç");
				String id = scannerSereal.next();

				switch (id) {
				case "001":
					qtdVendedores = analise.qtdVendedor(linha, vendedores);
					relatorio.setQtdVendedores(qtdVendedores);
					break;
				case "002":
					qtdCliente = analise.qtdClientes(linha, clientes);
					relatorio.setQtdClientes(qtdCliente);
					break;
				case "003":
					Vendas venda = new Vendas(linha);
					idVendaMaisCara = analise.idVendaMaisCara(linha, vendas, maiorValorVenda);
					relatorio.setIdMaiorValorVenda(idVendaMaisCara);
					String nomeVendedor1 = analise.piorVendedor(linha, vendas, menorValorVenda);
					relatorio.setNomeVendedor(nomeVendedor1);
					

					break;

				default:
					break;
				} 

			}
			scanner.close();


		}
		return relatorio;
		
	}

	public void zeraDados() {
		clientes = new ArrayList<>();
		vendas = new ArrayList<>();
		vendedores = new ArrayList<>();

	}

}
