package arrays;

public class Aluno {
	
	String nome;
	double[] notas;
	
	Aluno(String nomeInicial, int quantidadeDeNotas){
		this.nome = nomeInicial;
		this.notas = new double [quantidadeDeNotas];
	}
}
