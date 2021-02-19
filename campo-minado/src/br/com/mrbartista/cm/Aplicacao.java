package br.com.mrbartista.cm;

import br.com.mrbartista.cm.modelo.Tabuleiro;
import br.com.mrbartista.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {

		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);		
		new TabuleiroConsole(tabuleiro);
				
		tabuleiro.alternarMarcacao(4, 4);
		tabuleiro.alternarMarcacao(4, 5);
		tabuleiro.abrir(3, 3);
		
		System.out.println(tabuleiro);
	}
}
