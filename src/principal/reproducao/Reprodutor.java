package principal.reproducao;

public class Reprodutor implements ReprodutorVideo, ReprodutorMusical {

	public void aumentarVolume() {
		System.out.println("Aumentando Volume");
	}
	
	public void abaixarVolume() {
		System.out.println("Abaixando Volume");
	}
	
	@Override
	public void tocarMusica() {
		System.out.println("Tocando musica");
	}
	
	@Override
	public void pausarMusica() {
		System.out.println("Pausando musica");
	}

	@Override
	public void trocarDeMusica() {
		System.out.println("Trocando musica");
	}

	@Override
	public void trocarAlbum() {
		System.out.println("Trocando album");
	}
	
	@Override
	public void pausarVideo() {
		System.out.println("Pausando video");
	}

	@Override
	public void reproduzirVideo() {
		System.out.println("Reproduzindo video");
	}
}
