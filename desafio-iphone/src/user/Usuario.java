package user;

import devices.Iphone;

public class Usuario {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		iphone.atender();
		iphone.exibirPagina("www.google.com.br");
		iphone.tocar();
	}
}
