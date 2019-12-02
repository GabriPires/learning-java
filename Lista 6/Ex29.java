
public class Ex29 {

	public static void main (String[] args) {
		int i, j, c;
		for(i=1;i<=10;i++){
			System.out.print(i+", ");
			for(j=(i%2==0?2:1);j<=10;j+=2){
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
}

//Gabriel Antonio Santos Pires
