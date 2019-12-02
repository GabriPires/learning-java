import java.util.Random;

public class ADivisivelPorBRandom {

	public static void main (String[] args) {
		int a, b;

		Random r = new Random();
		a = r.nextInt(1001);
		b = r.nextInt(21);

		if(a%b==0){
			System.out.println(a+" e divisivel por "+b);
		}
		else{
			System.out.println(a+" nao e divisivel por "+b);
		}

	}
}

//Gabriel Antonio Santos Pires
