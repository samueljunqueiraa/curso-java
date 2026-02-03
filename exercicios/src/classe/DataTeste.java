package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		System.out.printf("%d/%d/%d", d1.dia, d1.mes, d1.ano);
		
		var d2 = new Data(31, 12, 2025);
		
		System.out.printf(d1.obterDataFormatada());
		System.out.printf(d2.obterDataFormatada());
	}  
}
