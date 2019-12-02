import java.util.Scanner;

public class Ex7 {

	public static void main (String[] args) {
		int i, n;
		Scanner s = new Scanner(System.in);

		System.out.print("Insira um valor entre 1 e 10: ");
		n = s.nextInt();

		while((n==0)||(n>10)){
			System.out.print("Valor incorreto, entre com um valor diferente de 0 e menor que 10: ");
			n = s.nextInt();
		}

		for(i=1;i<=10;i++){
			System.out.println(n+"x"+i+"="+n*i);
		}
	}
}

//Gabriel Antonio Santos Pires
