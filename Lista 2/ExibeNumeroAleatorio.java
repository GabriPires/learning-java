import java.util.Random;

public class ExibeNumeroAleatorio {

	public static void main (String[] args) {
		double numeroAleatorio = 0;

		Random num = new Random();
		numeroAleatorio = num.nextInt(101);
		System.out.println(numeroAleatorio);
	}
}

//Gabriel Antonio Santos Pires
