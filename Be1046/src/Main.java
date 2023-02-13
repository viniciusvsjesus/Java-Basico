import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	double horaInicial = teclado.nextDouble();
	double horaFinal = teclado.nextDouble(); 
	double resultado = horaFinal - horaInicial;
			if(resultado<=0) {
				System.out.println(resultado + 24 + "Horas");
			}else {
				System.out.println(resultado + "Horas");
	
	
	teclado.close();
	}
}
}
