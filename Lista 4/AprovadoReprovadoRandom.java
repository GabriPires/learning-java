import java.util.Random;

public class AprovadoReprovadoRandom {

	public static void main (String[] args) {
		int nota;

		Random num = new Random();
		nota = num.nextInt(11);

		if(nota<6){
			System.out.println("REPROVADO");
		}
		else{
			System.out.println("APROVADO");
		}
		
		System.out.println("Nota: "+nota);
	}
}

//Gabriel Antonio Santos Pires
