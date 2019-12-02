import java.util.Scanner;

public class HorasTrabalhadas {

	public static void main (String[] args) {
		int hrTrabalhadas, salHr, hrExtra=0;
		double salTotal;
		Scanner s = new Scanner(System.in);

		System.out.print("Digite as horas trabalhadas no mes: ");
		hrTrabalhadas = s.nextInt();
		System.out.print("Digite o valor da hora trabalhada: ");
		salHr = s.nextInt();

		if(hrTrabalhadas > 160){
			hrExtra = 160 - hrTrabalhadas;
			hrTrabalhadas = hrTrabalhadas - hrExtra;
		}

		salTotal = salHr * hrTrabalhadas + (hrExtra * (salHr +(salHr*0.5)));

		System.out.println("Salario total: R$"+salTotal);

	}
}

//Gabriel Antonio Santos Pires
