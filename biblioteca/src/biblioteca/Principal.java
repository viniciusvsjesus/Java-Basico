package biblioteca;

public class Principal {
	public static void main(String[] args) {

		Livro teoria = new Livro();
		teoria.titulo = "A teoria de tudo";
teoria.emprestado = false;
		
		if(teoria.verificar(teoria)) {
			System.out.println("Livro indisponível");
		}else {
			System.out.println("Livro disponivel)");
		}
		
		if(teoria.solicitarEmprestimo(teoria)) {
			System.out.println("Empréstimo negado");
		}else {
			System.out.println("Livro emprestado com sucesso");
		}
		
		
	}

}
