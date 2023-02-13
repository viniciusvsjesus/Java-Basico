package bemilecinco;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int x = teclado.nextInt();
		double y = teclado.nextDouble();
		double media = x/y;
		System.out.printf("%.3f km/l\n", media);
		
		
		teclado.close();
	}
}