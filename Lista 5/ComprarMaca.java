import java.util.Scanner;

public class ComprarMaca {

	public static void main (String[] args) {
		int numMaca;
		double valor=0;
		Scanner s = new Scanner(System.in);

		System.out.print("Digite o numero de macas compradas: ");
		numMaca = s.nextInt();

		if(numMaca < 0){
			System.out.println("Valor Invalido");
		}
		else if(numMaca < 12){
			valor = numMaca * 1.30;
		}else{
			valor = numMaca * 1;
		}

		System.out.println("Valor das macas: R$"+valor);
	}
}

//Gabriel Antonio Santos Pires
