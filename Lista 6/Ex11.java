import java.util.Scanner;

public class Ex11 {

	public static void main (String[] args) {
		int i, numAlunos, nota, soma=0;
		double media;
		Scanner s = new Scanner(System.in);

		System.out.print("Digite quantos alunos ha na sala: ");
		numAlunos = s.nextInt();

		for(i=1;i<=numAlunos;i++){
			System.out.print("Digite a nota do aluno "+i+": ");
			nota = s.nextInt();
			soma+=nota;
		}

		media = (double)soma / numAlunos;
		System.out.println("A media das notas dos "+numAlunos+" alunos foi "+media);
	}
}

//Gabriel Antonio Santos Pires	
