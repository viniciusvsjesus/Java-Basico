package biblioteca;

public class Principal {
	public static void main(String[] args) {

		Livro teoria = new Livro();
		teoria.titulo = "A teoria de tudo";
teoria.emprestado = false;
		
		if(teoria.verificar(teoria)) {
			System.out.println("Livro indispon�vel");
		}else {
			System.out.println("Livro disponivel)");
		}
		
		if(teoria.solicitarEmprestimo(teoria)) {
			System.out.println("Empr�stimo negado");
		}else {
			System.out.println("Livro emprestado com sucesso");
		}
		
		
	}

}
