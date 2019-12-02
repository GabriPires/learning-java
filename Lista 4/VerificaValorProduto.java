import java.util.Scanner;

public class VerificaValorProduto {

	public static void main (String[] args) {
		int precoProduto1, precoProduto2;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor do produto 1: ");
		precoProduto1 = entrada.nextInt();
		System.out.print("Digite o valor do produto 2: ");
		precoProduto2 = entrada.nextInt();

		if((precoProduto1 > 1000 || precoProduto1 < 0) || (precoProduto2 > 1000 || precoProduto2 < 0)){
			System.out.println("VALOR INVALIDO");
		}
		else{
			if(precoProduto1 < precoProduto2){
				System.out.println("O produto 1 e o mais barato");
			}
			else if(precoProduto2 < precoProduto1){
				System.out.println("O produto 2 e o mais barato");
			}
			else{
				System.out.println("Os preços dos dois produtos sao iguais");
			}
		}
	}
}

//Gabriel Antonio Santos Pires
