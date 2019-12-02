import java.util.Scanner;

public class Ex17 {

	public static void main (String[] args) {
		int n1, n2;
		double media;
		char op;
		Scanner s = new Scanner(System.in);

		do{
			do{
				System.out.print("Insira a primeira nota: ");
				n1 = s.nextInt();
			}while((n1<0)||(n1>10));

			do{
				System.out.print("Insira a segunda nota: ");
				n2 = s.nextInt();
			}while((n2<0)||(n2>10));

			media = (double)(n1+n2)/2;

			System.out.println("Media: "+media);
			System.out.println("NOVO CALCULO?(S/N)");
			op = s.next().charAt(0);
		}while(Character.toLowerCase(op) == 's');
	}
}

//Gabriel Antonio Santos Pires
