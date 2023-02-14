
public class Executavel {
public static void main(String[] args) {
	Funcionario funcionario = new Funcionario("Zézinho das couve ", "Programador", 1500);
			
			System.out.println(funcionario.imprimir());
	funcionario.aumentarSalario(5);
	System.out.println(funcionario.imprimir());
}
}
