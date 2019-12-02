import java.util.Scanner;

public class PrecoProduto {

	public static void main (String[] args) {
		int codOrigem;
		double precoProduto, frete, valorFinal;
		String procedencia;
		Scanner s = new Scanner(System.in);

		System.out.print("Digite o preco do produto R$");
		precoProduto = Double.parseDouble(s.nextLine());
		System.out.print("Digite o codigo de procedencia ");
		codOrigem = s.nextInt();

		if(codOrigem == 1){
			procedencia = "Norte";
			frete = 0.1 * precoProduto;
		}
		else if((codOrigem==2)&&(codOrigem==5)&&(codOrigem==9)){
			procedencia = "Sul";
			frete = 0.03 * precoProduto;
		}
		else if((codOrigem==3)||((codOrigem>=10)||(codOrigem<=15))){
			procedencia = "Leste";
			frete = 0.012 * precoProduto;
		}
		else if((codOrigem==7)&&(codOrigem==20)){
			procedencia = "Oeste";
			frete = 0.073 * precoProduto;
		}
		else{
			procedencia = "Importado";
			frete = 0.222 * precoProduto;
		}

		valorFinal = precoProduto + frete;
		System.out.println("\nProcedencia: "+procedencia);
		System.out.println("Frete: R$"+frete);
		System.out.println("Preco final do produto: R$"+valorFinal);
	}
}

//Gabriel Antonio Santos Pires
