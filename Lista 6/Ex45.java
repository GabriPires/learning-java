import java.util.Scanner;

public class Ex45 {

	public static void main (String[] args) {
		int i, c, n, f=1;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o numero de termos: ");
		n = sc.nextInt();

		for(c=n;c>=1;c--){
			f=1;
			for(i=1;i<=c;i++){
				f*=i;
			}
			System.out.println("Fatorial de "+c+": "+f);
		}
	}
}
 //Gabriel Antonio Santos Pires
