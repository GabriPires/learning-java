import java.util.Scanner;
class exer30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        String codigo = "", ncodigo = "";
        int opcao = 0, j = 0;



        do {
            System.out.println("Menu");
            System.out.println("1-Criptografar codigo");
            System.out.println("2-Descriptografar codigo");
            System.out.println("3-Sair");
            System.out.println("Opcao:");
            opcao = scanner.nextInt();


            if (opcao == 1) {
                System.out.println("Digite o codigo");
                codigo = scannerString.nextLine();

                for (int i = 0; i < codigo.length(); i++) {

                    if (codigo.charAt(i) >= (char) 97 && codigo.charAt(i) <= (char) 109 || codigo.charAt(i) >= (char) 65 && codigo.charAt(i) <= (char) 77) {
                        j = codigo.charAt(i) + 13;
                        ncodigo += (char) j;
                    } else if (codigo.charAt(i) >= (char) 110 && codigo.charAt(i) <= (char) 122 || codigo.charAt(i) >= (char) 78 && codigo.charAt(i) <= (char) 90) {
                        j = codigo.charAt(i) - 13;
                        ncodigo += (char) j;
                    } else {

                        ncodigo += codigo.charAt(i);
                    }

                }
                System.out.println(ncodigo);
                ncodigo = "";

            } else if (opcao == 2) {
                System.out.println("Digite o codigo");
                codigo = scannerString.nextLine();
                for (int i = 0; i < codigo.length(); i++) {

                    if (codigo.charAt(i) >= (char) 97 && codigo.charAt(i) <= (char) 109 || codigo.charAt(i) >= (char) 65 && codigo.charAt(i) <= (char) 77) {
                        j = codigo.charAt(i) + 13;
                        ncodigo += (char) j;
                    } else if (codigo.charAt(i) >= (char) 110 && codigo.charAt(i) <= (char) 122 || codigo.charAt(i) >= (char) 78 && codigo.charAt(i) <= (char) 90) {
                        j = codigo.charAt(i) - 13;
                        ncodigo += (char) j;
                    } else {

                        ncodigo += codigo.charAt(i);
                    }

                }
                System.out.println(ncodigo);
                ncodigo = "";
            } else if (opcao > 3 || opcao <= 0) {
                System.out.println("Valor Invalido.");
            }


        } while (opcao != 3);

        scannerString.close();
        scanner.close();
    }
}
/*A B C D E F G H I J K L M 
  N O P Q R S T U V W X Y Z
*/