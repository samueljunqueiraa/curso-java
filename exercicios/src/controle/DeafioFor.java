package controle;

public class DeafioFor {
	
	public static void main(String[] args) {
		
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}
}
