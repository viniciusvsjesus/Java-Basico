
public class Funcionario {

	private String nome;
	private String cargo;
	private String cargo;
	private String cargo;
	private String cargo;
	private double salario;
	public Funcionario(String nome, String cargo, double salario) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	public String imprimir() {
		String informacoes = String.format("Olá %s, o seu cargo é %s e você possui um salário de R$ %.2f", nome, cargo, salario );
				return informacoes;
	}
	public void aumentarSalario(double valorAumento) {
		salario +=  salario*valorAumento/100;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
	
}
