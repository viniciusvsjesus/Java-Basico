package leitura;

import java.util.Scanner;

public class TesteLeitura {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int primeiroNumero = teclado.nextInt();
		System.out.println(primeiroNumero);
		System.out.println("Digite o segundo numero: ");
		double segundoNumero = teclado.nextDouble();

		System.out.println(segundoNumero);
	}
}
