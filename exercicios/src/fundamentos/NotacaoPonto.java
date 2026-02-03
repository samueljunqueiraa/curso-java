package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		System.out.println(s);
		
		String y = "Bom dia X".replace("X", "Gui").toUpperCase().concat("!!!");
		System.out.println(y);
		
		///tipos Primitivos não tem o operador "."
		int a = 3;
		System.out.println(a);
	}
}
