package br.com.vainaweb.backendt1.classeabstrata;

public class App {

	public static void main(String[] args) {
		
		DevBackEnd devJunior = new DevBackEnd("Hamom", "9876", 20, "Lógica");
		DevFrontEnd devFrontJunior = new DevFrontEnd("Thalia", "1234", 23, "UX/UI" );
		Designer designer = new Designer("Vanessa", "4567", 19, "Criatividade");
		Gerente gerente = new Gerente("João Pedro Belo", "6543", 12, "Liderança");
		
	}

}
