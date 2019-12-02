import java.util.Scanner;

public class Ex46 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, c=0;

		System.out.print("Digite um numero: ");
		n = sc.nextInt();

		for(int i=1;i<=n;i++){
			if(n%i==0){
				c++;
			}
		}

		if(c==2){
			System.out.print(n+" e um numero primo");
		}
		else{
			System.out.print(n+" nao e um numero primo");
		}
	}
}

//Gabriel Antonio Santos Pires
