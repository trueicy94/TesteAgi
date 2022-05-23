package br.ntconsult.model.teste.service;

import java.io.IOException;
import java.util.TimerTask;

import br.ntconsult.model.teste.entradaDados.EntradaDeDados;
import br.ntconsult.model.teste.saidaDeDados.SaidaDeDados;
import br.ntconsult.model.teste.tiposDeDados.Relatorio;

public class IniciaProjeto extends TimerTask {

	EntradaDeDados entrada = new EntradaDeDados();
	SaidaDeDados saida = new SaidaDeDados();

	public void iniciaProjeto() {
		var pegarArquivoTxt = entrada.pegaArquivotxt();
		if (!pegarArquivoTxt.isEmpty()) {
			try {
				for (String arq : pegarArquivoTxt) {
					Relatorio relatorio = entrada.listaELeArquivos(arq, pegarArquivoTxt);
					saida.relatorio(relatorio, arq);
					entrada.zeraDados();
					
				}
            } catch (IOException e) {
                e.printStackTrace();
            }

		}
	}

	@Override
	public void run() {
		iniciaProjeto();
	}

}
