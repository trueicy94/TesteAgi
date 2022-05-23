package br.ntconsult.model.teste.saidaDeDados;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import br.ntconsult.model.teste.tiposDeDados.Relatorio;

public class SaidaDeDados {

	String caminhoRelatorio = "C:/Users/Admin/Desktop/Agi/out";

	public SaidaDeDados() {
	}


	public void relatorio(Relatorio relatorio, String nomesArquivos) throws FileNotFoundException {
		PrintStream ps = new PrintStream(new File(caminhoRelatorio + "/Relatorio -"+ nomesArquivos));
		ps.println("Total de Funcionários:"+ relatorio.getQtdVendedores());
		ps.println("Total de Clientes:"+ relatorio.getQtdClientes());
		ps.println("ID venda mais cara:"+ relatorio.getIdMaiorValorVenda());
		ps.println("O pior vendedor:"+ relatorio.getNomeVendedor());
		
		ps.close();

	}
	
	
	
	
	
}

