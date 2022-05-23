package br.ntconsult.model.teste;

import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Timer;

import br.ntconsult.model.teste.service.IniciaProjeto;

public class ClassePrincipal {
	public static void main(String[] args) throws FileNotFoundException {
		var timer = new Timer();
		
		var  inicia = new IniciaProjeto();
		
		
		timer.schedule(inicia, new Date(), 600);
		
		
		

	}

}
