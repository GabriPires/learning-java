import java.util.Scanner;

public class CalcularMedia {

	public static void main (String[] args) {
		int n1, n2;
		double media;
		Scanner s = new Scanner(System.in);

		System.out.print("Insire a nota 1: ");
		n1 = s.nextInt();
		System.out.print("Insire a nota 2: ");
		n2 = s.nextInt();

		media = ((double)n1 + n2)/2;

		if(media < 6){
			System.out.println("Aluno reprovado\nMedia: "+media);
		}
		else{
			System.out.println("Aluno aprovado\nMedia: "+media);
		}
	}
}

//Gabriel Antonio Santos Pires
