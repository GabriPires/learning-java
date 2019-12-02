import java.util.Scanner;
class exer29 {

    public static void main(String[] args) {
        String zenitpolar = "zenitpolarZENITPOLAR", polarzenit = "polarzenitPOLARZENIT", frase = "";
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);


        int opcao;

        do {
            System.out.println("Digite a opcao");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Digite a frase");
                frase = scanner.nextLine();
                for (int i = 0; i < frase.length(); i++) {
                        int aux = 0;
                        for (int j = 0; j < zenitpolar.length(); j++) {
                            if (zenitpolar.charAt(j) == frase.charAt(i)) {
                                System.out.print(polarzenit.charAt(j));
                            } else {
                                aux++;
                            }
                        }
                        if (aux == 20) {
                            System.out.print(frase.charAt(i));
                        }
                    
                }
                } else if (opcao == 2) {
                    System.out.println("Digite a frase");
                    frase = scanner.nextLine();
                    for (int i = 0; i < frase.length(); i++) {
                        int aux = 0;
                        for (int j = 0; j < zenitpolar.length(); j++) {
                            if (zenitpolar.charAt(j) == frase.charAt(i)) {
                                System.out.print(polarzenit.charAt(j));
                            } else {
                                aux++;
                            }
                        }
                        if (aux == 20) {
                            System.out.print(frase.charAt(i));
                        }
                    }
                } else if (opcao > 3) {
                    System.out.println("Opcao Invalida");
                }
                System.out.println("");
            }
            while (opcao != 3);
            scanner.close();
            sc.close();
        }
    }