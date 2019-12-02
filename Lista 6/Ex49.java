import java.util.Scanner;

public class Ex49 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,c=0;
		String s="";
		
		System.out.print("Insira a quantidade de termos: ");
		int n = sc.nextInt();
		
		int k=1;
		for(i=2;k<=n;i++){
			c=0;
			for(j=1;j<=i;j++){
				if(i%j==0){
					c++;
				}
			}
			if(c==2){
				s = i+ " " + s;
				k++;
			}
		}
		
		System.out.print(s);
		
		
	}
}

//Gabriel Antonio Santos Pires
