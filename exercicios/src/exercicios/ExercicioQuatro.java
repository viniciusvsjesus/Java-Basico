package exercicios;

import java.util.Scanner;

public class ExercicioQuatro {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	double valorHora;
	int quantidadeHora;
	double percentualDesconto = 12.5;
	
	System.out.println("Digite o valor da hora trabalhada: ");
valorHora = teclado.nextDouble();
System.out.println("Digite a quantidade de horas trabalhadas: ");
quantidadeHora = teclado.nextInt();

double salarioBruto = valorHora * quantidadeHora;
double salarioLiquido = salarioBruto - (percentualDesconto * salarioBruto)/100;  

 
System.out.println(salarioLiquido);
	
}
}
