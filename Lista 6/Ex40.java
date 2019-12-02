import java.util.Scanner;

public class Ex40 {

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
			for(i=1;i<=n;i++){
				if(i<n/2){
					System.out.print(c+", ");
					c++;
				}
				else if(i==n/2){
					if(n%2==0){
						System.out.print(c+", ");
					}
					else{
						//System.out.print(c+", "+(++c)+", ");
						System.out.print(c+", ");
						//i++;
						c++;
					}
				}
				else{
					System.out.print(c+", ");
					c--;
				}
			}
		}
	}
}

//Gabriel Antonio Santos Pires
