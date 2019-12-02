import java.util.Scanner;

public class Ex19 {

	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int nMerc=0, valor, vTotal=0;
		double media;
		char op;

		do{
			System.out.print("Insira o valor da mercadoria: ");
			valor = s.nextInt();
			vTotal+=valor;
			nMerc++;
			System.out.print("MAIS MERCADORIAS?(S/N): ");
			op = s.next().charAt(0);
		}while(Character.toLowerCase(op) == 's');

		System.out.println("Valor total em estoque: "+vTotal);
		media = vTotal / nMerc;
		System.out.println("Media de valor das mercadorias: "+media);
	}
}

//Gabriel Antonio Santos Pires
