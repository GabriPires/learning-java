import java.util.Scanner;

public class Comissao {

	public static void main (String[] args) {
		int salFixo, valorVendas;
		double comissao, salTotal;
		Scanner s = new Scanner(System.in);

		System.out.print("Digite o salario fixo: ");
		salFixo = s.nextInt();
		System.out.print("Digite o valor vendido: ");
		valorVendas = s.nextInt();

		if(valorVendas > 1500){
			comissao = 1500 * 0.03 + ((valorVendas-1500)*0.05);
		}
		else{
			comissao = valorVendas * 0.03;
		}

		salTotal = salFixo + comissao;
		System.out.println("Salario total: R$"+salTotal);
	}
}

//Gabriel Antonio Santos Pires
