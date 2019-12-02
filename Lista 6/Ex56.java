
public class Ex56 {

	public static void main (String[] args) {
		int i, j, soma=0;

		for(i=1;i<900;i++){
			soma = 0;
			for(j=1;j<i;j++){
				if(i%j == 0){
					soma+=j;
				}
			}
			if(i == soma){
				System.out.print(i+", ");
			}
		}
	}
}

//Gabriel Antonio Santos Pires
