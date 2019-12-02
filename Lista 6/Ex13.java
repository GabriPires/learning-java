import java.util.Scanner;

public class Ex13 {

	public static void main (String[] args) {
		int i, n, soma=0;
		Scanner s = new Scanner(System.in);

		for(i=1;i<=10;i++){
			System.out.print("Insira valores: ");
			n = s.nextInt();
			if(n<40){
				soma+=n;
			}
		}

		System.out.print("A soma foi "+soma);
	}
}

//Gabriel Antonio Santos Pires
