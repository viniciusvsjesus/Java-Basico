package exercicios;

import java.util.Scanner;

public class ExercecioCinco {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o tempo gasto:  ");
		int tempoGasto = teclado.nextInt();
		System.out.println("Digite a velocidade média: ");
		double velocidadeMedia = teclado.nextDouble();

		double distancia = tempoGasto * velocidadeMedia;
		System.out.println("A quantidade  de litros gastos foram: " + distancia / 12);
	}
}
