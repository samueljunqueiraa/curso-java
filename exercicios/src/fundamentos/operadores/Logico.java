package fundamentos.operadores;

public class Logico {
	
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); // AND
		System.out.println(condicao1 || condicao2); // OR
		System.out.println(condicao1 ^ condicao2); // XOR
		System.out.println(!!condicao1); // NOT DUPLO
		System.out.println(!condicao2); // NOT
		
		System.out.println("\nTabela verdade do E (AND)");
		System.out.println(true && true);   // true
		System.out.println(true && false);  // false
		// System.out.println(false && true);  // false
		// System.out.println(false && false); // false
		
		System.out.println("\nTabela verdade do OU (OR)");
		// System.out.println(true || true);  
		// System.out.println(true || false); 
		System.out.println(false || true);  
		System.out.println(false || false); 
		
		System.out.println("\nTabela verdade do OU exclusivo (XOR)");
		System.out.println(true ^ true);  
		System.out.println(true ^ false); 
		System.out.println(false ^ true);  
		System.out.println(false ^ false); 
		
		System.out.println("\nTabela verdade do NOT");
		System.out.println(!true);  
		System.out.println(!false); 
		System.out.println(!!true);  
		System.out.println(!!false); 
	}
}
