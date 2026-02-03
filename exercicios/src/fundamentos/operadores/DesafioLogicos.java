package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		// Trabalho na terça (V)
		// Trabalho na quinta (V)
		// Se os dois trabalhos derem certo, vou comprar a TV de 50'
		// Se apenas um der certo, vou comprar a TV de 32'
		// Se nenhum der certo, vou ficar em casa estudando

		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean compraTV50 = trabalho1 && trabalho2;
		boolean compraTV32 = trabalho1 ^ trabalho2;
		System.out.println("Compra TV 50'? " + compraTV50);
		System.out.println("Compra TV 32'? " + compraTV32);
		System.out.println("Ficar em casa estudando'? " + (!compraTV50 && !compraTV32));
	}
}
