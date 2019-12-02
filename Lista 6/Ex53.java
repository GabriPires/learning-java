
public class Ex53 {

	public static void main (String[] args) {
		int a=0, b=0, c=0;

		for(int i=0; c<255; i++){
			if(i==1){
				a = 1;
			}
			c = a + b;
			a = b;
			b = c;

			if(c<255){
				System.out.print(c+" ");
			}
		}
	}
}

//Gabriel Antonio Santos Pires
