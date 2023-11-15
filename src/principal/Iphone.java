package principal;

import principal.internet.Navegador;
import principal.reproducao.Reprodutor;
import principal.telefone.AparelhoTelefonico;

public class Iphone {

	public static void main(String[] args) {
		System.out.println("-----Reprodutor-----");
		Reprodutor rm = new Reprodutor();
		rm.reproduzirVideo();
		rm.abaixarVolume();
		rm.aumentarVolume();
		rm.pausarVideo();
		rm.tocarMusica();
		rm.abaixarVolume();
		rm.aumentarVolume();
		rm.trocarAlbum();
		rm.trocarDeMusica();
		rm.pausarMusica();
		System.out.println(" ");
		
		System.out.println("-----Aparelho Telefônico-----");
		AparelhoTelefonico at = new AparelhoTelefonico();
		at.atender();
		at.ligar();
		at.iniciarCorreioVoz();
		at.listarContatos();
		at.listarHistoricoDeChamadas();
		System.out.println(" ");
		
		System.out.println("-----Navegador na Internet-----");
		Navegador nav = new Navegador();
		nav.adicionarNovaAba();
		nav.exibirPagina();
		nav.trocarAba();
		nav.fecharAba();
	}
}
