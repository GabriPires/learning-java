import java.util.Scanner;

public class Ex38 {

	public static void main (String[] args) {
		int n=0, i, c=1;
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com a quantidade de termos: ");
		do{
			n = sc.nextInt();
		}while(n<0);

		if(n==0){
			System.out.print("Programa encerrado");
		}
		else{
			for(i=0;i<=n;i++){
				if(i==0){
					System.out.print(i+"("+i+"/"+c+"), ");
					c++;
				}
				else{
					System.out.print(i+"/"+c+", ");
					c++;
				}
			}
		}



	}
}

//Gabriel Antonio Santos Pires
