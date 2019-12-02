
public class Ex30 {

	public static void main (String[] args) {
		int i, j, c=2;
		for(i=1;i<=10;i++){
			System.out.print(i+", ");
			for(j=(i%2==0?2:1);j<=c;j+=2){
				System.out.print(j+" ");
			}
			c+=2;
			System.out.println("");
		}
	}
}

//Gabriel Antonio Santos Pires
