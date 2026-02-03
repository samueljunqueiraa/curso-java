package fundamentos;

import java.util.Scanner;

public class ScannerFuncao {
	public static void main(String[] args) {
		// 2. Instanciar (Criar o objeto)
        // System.in significa "Entrada do Sistema" (Teclado)
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome?");
        // 3. Ler o dado (String)
        String nome = leitor.nextLine();

        System.out.println("Qual sua idade?");
        // 3. Ler o dado (Número Inteiro)
        int idade = leitor.nextInt();

        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");

        // 4. Boa prática: Fechar o scanner para liberar memória
        leitor.close();
	}
}
