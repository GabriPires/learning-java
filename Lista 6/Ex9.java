import java.util.Scanner;

public class Ex9 {

	public static void main (String[] args) {
		int n, i, d=0, f=0;
		Scanner s = new Scanner(System.in);

		for(i=1;i<=10;i++){
			System.out.print("Entre com um valor para verificacao: ");
			n = s.nextInt();

			if(n>=10&&n<=20){
				d++;
			}
			else{
				f++;
			}
		}

		System.out.println("\nForam escritos "+d+" numeros no intervalo entre 10 e 20\nForam escritos "+f+" numeros fora do intervalo.");
	}
}

//Gabriel Antonio Santos Pires
