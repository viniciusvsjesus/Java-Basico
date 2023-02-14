
public class Conta {
	private int numeroConta;
	private int digitoVerificador;
	private String cpf;
	private double saldo = 0;

	public boolean depositar(double valor ) {
		if (valor > 0) {
			saldo = valor;
			return true;
		}
		return false;

	}

	public boolean sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}
	
	public void exibir() {
		System.out.println("Seu numero da conta é: " + numeroConta);
		System.out.println("O seu digito verificador é: " + digitoVerificador);
		System.out.println("O seu cpf é " + cpf);
		System.out.printf("O seu saldo atual é de R$ %.2f", saldo); 
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getDigitoVerificador() {
		return digitoVerificador;
	}

	public void setDigitoVerificador(int digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

}
