import java.util.Scanner;

public class Executavel {
public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	Conta c1 = new Conta();
	c1.setNumeroConta(1111);;
	c1.setDigitoVerificador(11);
c1.setCpf("000.000.000-11");
System.out.println("Digite o valor do deposito");
double valorDeposito= teclado.nextDouble();

if(c1.depositar(valorDeposito)) {
	System.out.println("Depósito efetuado com sucesso");
}else {
	System.out.println("Depósito falhou");
}

System.out.printf("O seu saldo atual é R$  %.2f\n", c1.getSaldo());
System.out.println("Digite o valor do saque: ");
double valorSaque =teclado.nextDouble(); 
if(c1.sacar(valorSaque)) {
	System.out.println("Saque efetuado com sucesso");
}else {
	System.out.println("O saque não pode ser efetuado");
}
c1.exibir();
teclado.close();
}
}
