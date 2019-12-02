import java.util.Scanner;

public class Ex5 {

	public static void main (String[] args) {
		int n, i;
		Scanner s = new Scanner(System.in);

		System.out.print("Entre com um valor diferente de 0: ");
		n = s.nextInt();
		
		while(n==0){
			System.out.print("Valor incorreto, entre com um valor diferente de 0: ");
			n = s.nextInt();
		}

		for(i=1;i<=n;i++){
			System.out.println(i);
		}
	}
}

//Gabriel Antonio Santos Pires
