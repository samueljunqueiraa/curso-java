package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Informe a média:");
			double media = entrada.nextDouble();
			
			if(media <=10 && media >=7.0) {
				System.out.println("Parabés, você está aprovado!");
			} else if (media <=6.9 && media >=5.0) {
				System.out.println("Você está de recuperação");
			} else if(media <=4.9 && media > 0) {
				System.out.println("Você está reprovado!");
			}else {
				System.out.println("Valor invalido!");
			}
			
			entrada.close();
	}
}
