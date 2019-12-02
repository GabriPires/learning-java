import java.util.Scanner;

public class Ex18 {

	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int i, nMerc, valor, vTotal=0;
		double media;

		System.out.print("Insira o numero total de mercadorias: ");
		nMerc = s.nextInt();

		for(i=1;i<=nMerc;i++){
			System.out.print("Insira o valor da mercadoria: ");
			valor = s.nextInt();
			vTotal+=valor;
		}

		System.out.println("Valor total em estoque: "+vTotal);
		media = vTotal / nMerc;
		System.out.println("Media de valor das mercadorias: "+media);
	}
}

//Gabriel Antonio Santos Pires
