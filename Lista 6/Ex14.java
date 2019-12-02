import java.util.Scanner;

public class Ex14 {

	public static void main (String[] args) {
		int i, n1, n2, c;
		Scanner s = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		n1 = s.nextInt();
		do{
			System.out.print("Digite um valor maior que o anterior: ");
			n2 = s.nextInt();
		}while(n1>n2);
		c=n1;
		for(i=n1+1;i<=n2;i++){
			c+=i;
		}

		System.out.println("A soma dos inteiros deu "+c);
	}
}

//Gabriel Antonio Santos Pires
