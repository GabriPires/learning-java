import java.util.Scanner;

public class Ex20 {

	public static void main (String[] args) {
		int i, v, maior=0, menor=0;
		Scanner s = new Scanner(System.in);

		for(i=1;i<=100;i++){
			System.out.print("Insira o "+i+" valor: ");
			v = s.nextInt();
			if(i==1){
				maior=v;
				menor=v;
			}
			if(v > maior){
				maior = v;
			}
			if(v < menor){
				menor = v;
			}
		}

		System.out.println("Maior valor: "+maior);
		System.out.println("Menor valor: "+menor);		
	}
}
