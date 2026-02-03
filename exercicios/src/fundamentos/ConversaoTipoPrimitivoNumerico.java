package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; //implícita
		System.out.println(a);
		
		//1.1234568 - Perdeu precisão
		float b = (float) 1.12345678910; //explícita (cast)	
		System.out.println(b);
		
		int c = 130;
		byte d = (byte) c; //explícita (cast)
		System.out.println(d);
	}
}
