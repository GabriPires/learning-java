import java.util.Scanner;

public class MaiorMenorQue10 {

	public static void main (String[] args) {
		int valor;
		Scanner s = new Scanner(System.in);

		System.out.print("Insira um valor: ");
		valor = s.nextInt();

		if(valor > 10){
			System.out.println("E maior que 10");
		}
		else{
			System.out.println("Nao e maior que 10");
		}
	}
}

//Gabriel Antonio Santos Pires
