import java.time.LocalDate;

import Enum.Genero;
import Enum.Senioridade;

public class App {

	public static void main(String[] args) {
		
		DevBackEnd devbBack = new DevBackEnd("Hamom", "9876", 8000, 20,Genero.GENDERQUEER,Senioridade.Junior,"Lógica");
		DevFrontEnd devFront = new DevFrontEnd("Thalia", "1234", 8000, 23, Genero.FEMENINO, Senioridade.Pleno,LocalDate.of(2025, 12, 14), "UX/UI" );
		Designer designer = new Designer("Vanessa", "4567",1200, 19,Genero.FEMENINO,Senioridade.Estagio, "Criatividade");
		Gerente gerente = new Gerente("João Pedro Belo", "6543", 15000, 12, Genero.OUTRO, Senioridade.Senior, "Liderança");
		System.out.println(devbBack.visualizar());
		System.out.println(devFront.visualizar());
		System.out.println(designer.visualizar());
		System.out.println(gerente.visualizar());
	}

}
