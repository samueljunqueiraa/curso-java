package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Qual é o seu primeiro salário?");
        // 1. Ler o salário como (String)
        String valor1 = leitor.next().replace(",", ".");
        
        System.out.print("Qual é o seu segundo salário?");
        // 1. Ler o salário como (String)
        String valor2 = leitor.next().replace(",", ".");
        
        System.out.print("Qual é o seu terceiro salário?");
        // 1. Ler o salário como (String)
        String valor3 = leitor.next().replace(",", ".");
        
        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);
        
        double media = (salario1 + salario2 + salario3) / 3;
        System.out.println("A média salarial é: " + media);
        leitor.close();
	}
}
