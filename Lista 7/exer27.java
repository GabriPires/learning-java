import java.util.Scanner;
class exer27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String palavra1 = "", palavra2 = "", saida = "";

        System.out.println("Digite a palavra 1");
        palavra1 = scanner.nextLine();
        System.out.println("Digite a palavra 2");
        palavra2 = scanner.nextLine();

        if (palavra1.length() == palavra2.length()) {
            for (int i = 0; i < palavra1.length(); i++) {
                if (i < palavra1.length()) {
                    saida += palavra1.charAt(i);
                }
                if (i < palavra2.length()) {
                    saida += palavra2.charAt(i);
                }
            }
            System.out.println(saida);
        } else {
            System.out.println("Erro ! Entradas de tamanhos diferentes");
        }
        scanner.close();
    }
}