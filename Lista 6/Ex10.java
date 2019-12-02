import java.util.Scanner;

public class Ex10 {

	public static void main (String[] args) {
		int i, n, soma=0;
		double media;
		Scanner s = new Scanner(System.in);

		for(i=1;i<=10;i++){
			System.out.print("Insira valores para calculo da media: ");
			n = s.nextInt();
			soma+=n;
		}

		media = (double)soma / --i;
		System.out.print("A media foi "+media);
	}
}

//Gabriel Antonio Santos Pires
