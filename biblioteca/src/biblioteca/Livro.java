package biblioteca;

public class Livro {
String titulo;
String autor;
int anoPublicacao;
String categoria;
int posicao;
int estante;
int prateleira;
boolean emprestado = true;

public boolean solicitarEmprestimo(Livro livro) {
	if(livro.emprestado) {
		return true;
	}
	return false;
}

public boolean verificar(Livro livro) {
	if(livro.emprestado) {
		return true;
	}else {
		return false;
	}
}


}

