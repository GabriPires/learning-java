import java.util.Scanner;

public class Ex63 {

	public static void main (String[] args) {
		int i, nt, a=2, b=1, af=0, bf=1, cf=0, ip=0, jp=0, cp=0, p=2;
		double soma=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com a quantidade de termos: ");
		nt = sc.nextInt();

		for(i=0;i<nt;i++){
			if(i==1){
				cf = 1;
			}
			else{
				cf = af + bf;
				af = bf;
				bf = cf;
			}
			a = cf;
			
			do{
				cp=0;
				for(ip=1;ip<=p;ip++){
					if(p%ip==0){
						cp++;
					}
				}
				if(cp==2){
					b = p;
				}
				p++;
			}while(cp!=2);

			soma+=(double)a/b;
			System.out.print(a+"/"+b+" + ");
		}
		System.out.println("\nSoma: "+soma);
	}
}

//Gabriel Antonio Santos Pires
