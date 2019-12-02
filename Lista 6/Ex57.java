import java.util.Scanner;


public class Ex57 {

	public static void main (String[] args) {
		int i, j, n, soma=0, c=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o numero de termos a ser exibido: ");
		n = sc.nextInt();

		for(i=1;c<n;i++){
			soma = 0;
			for(j=1;j<i;j++){
				if(i%j == 0){
					soma+=j;
				}
			}
			if(i == soma){
				System.out.print(i+", ");
				c++;
			}
		}
	}
}

//Gabriel Antonio Santos Pires
