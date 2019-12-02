import java.util.Random;

public class VerificaValorProdutoRandom {

	public static void main (String[] args) {
		int precoProduto1, precoProduto2;

		Random num = new Random();
		precoProduto1 = num.nextInt(1000+1);
		precoProduto2 = num.nextInt(1000+1);

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

//Gabriel Antonio Santos Pires
