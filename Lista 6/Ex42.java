import java.util.Scanner;

public class Ex42 {

	public static void main (String[] args) {
		int i, j, f=1;

		for(i=0;i<=10;i++){
			f=1;
			for(j=1;j<=i;j++){
				f*=j;
			}	
			System.out.println("Fatorial "+i+": "+f);
		}
	}
}

//Gabriel Antonio Santos Pires
