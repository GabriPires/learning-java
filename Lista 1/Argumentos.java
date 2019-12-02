public class Argumentos {

	public static void main (String[] args) {

		if(args.length > 0){
			for (int i=0;i<args.length;i++) {
				System.out.println( (i+1)+ "-" + args[i]);
			}
		} else{
			System.out.println("Nao ha argumentos");
		}

	}
}

//Gabriel Antonio Santos Pires
