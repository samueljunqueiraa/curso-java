package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		// Enquanto nota for diferente de 1 -> O laço continua rodando
		while(nota != -1) {
			System.out.print("Informe a nota [Ou -1 p/ sair]: ");
			nota = entrada.nextDouble(); // Programa fica esperando o usuário digitar um número
			
			if(nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;
			} else {
				System.out.println("Nota inválida!");
			}
		}
		//Calcular a média
		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media);

		entrada.close();
	}
}
