import java.util.Scanner;

public class Ex8 {

	public static void main (String[] args) {
		int n, i, c=0;
		Scanner s = new Scanner(System.in);

		for(i=1;i<=10;i++){
			System.out.print("Entre com um valor para verificacao: ");
			n = s.nextInt();

			if(n<0){
				c++;
			}
		}

		System.out.println("\nForam escritos "+c+" numeros negativos.");
	}
}

//Gabriel Antonio Santos Pires
