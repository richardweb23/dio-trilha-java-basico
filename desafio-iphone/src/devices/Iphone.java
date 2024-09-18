package devices;

import aplicativos.AparelhoTelefonico;
import aplicativos.NavegadorInternet;
import aplicativos.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
	@Override
	public void ligar(Number numero) {
		System.out.println("Você está ligando para: " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Atendeu ligação!");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciou correio de voz!");		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Você está navegando em: " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada!");		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada!");		
	}

	@Override
	public void tocar() {
		System.out.println("Está tocando!");		
	}

	@Override
	public void pausar() {
		System.out.println("Pause!");		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Música selecionada: " + musica);		
	}
}
