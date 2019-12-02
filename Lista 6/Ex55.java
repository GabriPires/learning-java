import java.util.Scanner;

public class Ex55 {

	public static void main (String[] args) {
		int i, n, soma=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira um numero para verificacao: ");
		n = sc.nextInt();

		for(i=1;i<n;i++){
			if(n%i == 0){
				soma+=i;
			}
		}

		if(n == soma){
			System.out.println("E um numero perfeito");
		}
		else{
			System.out.println("Nao e um numero perfeito");
		}

	}
}

//Gabriel Antonio Santos Pires
