/*
public class Ex47 {

	public static void main (String[] args) {
		int i,j,c=0;

		for(i=2;i<=100;i++){
			c=0;
			for(j=1;j<=i;j++){
				if(i%j==0){
					c++;
				}
			}
			if(c==2){
				System.out.print(i+", ");
			}
		}
	}
}

Gabriel Antonio Santos Pires
*/

public class Ex47 {

	public static void main (String[] args) {
		int i,j,c=0;

		for(int k=1;k<=100;k++){
			c=0;
			for(i=k;/*i<=100*/c<2;i++){
				//c=0;
				for(j=1;j<=i;j++){
					if(i%j==0){
						c++;
					}
				}
				if(c==2){
					System.out.print(i+", ");
				}
			}
		}
	}
}

//Gabriel Antonio Santos Pires
