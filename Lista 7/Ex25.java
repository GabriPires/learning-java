import java.util.Scanner;

class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha, simbolos = "!@#$%&*()+";
        int tamanho = 0, letras = 0, num = 0, simb = 0, valid = 0, c = 0;

        do {
            tamanho = 0;
            letras = 0;
            num = 0;
            simb = 0;
            valid = 0;
            c = 0;
            
            System.out.print("Digite uma senha: ");
            senha = sc.nextLine();

            tamanho = senha.length();
            for (int i = 0; i < tamanho; i++) {
                //VERIF NUMEROS
                if (senha.charAt(i) >= (char) 48 && senha.charAt(i) <= (char) 57) {
                    num++;
                }
                //VERIF LETRAS MAIUSCULAS
                /*if (senha.charAt(i) >= (char) 65 && senha.charAt(i) <= (char) 90) {
                    letraM++;
                }*/
                //VERIF SIMBOLOS
                for (c = 0; c < senha.length(); c++) {
                    if (simbolos.charAt(c) == senha.charAt(i)) {
                        simb++;
                    }
                }
                //VERIF NUM DE LETRAS
                if (senha.toLowerCase().charAt(i) >= (char) 97 && senha.toLowerCase().charAt(i) <= (char) 122) {
                    letras++;
                }
            }

            System.out.println("Tamanho 10: " + tamanho + (tamanho >= 10 ? " ok" : " x"));
            System.out.println("Letras 3: " + letras + (letras >= 3 ? " ok" : " x"));
            System.out.println("Numeros 3: " + num + (num >= 3 ? " ok" : " x"));
            System.out.println("Simbolos 2: " + simb + (simb >= 2 ? " ok" : " x"));

            if (tamanho >= 10 && letras >= 3 && num >= 3 && simb >= 2) {
                System.out.println("Senha aprovada! Parabens!");
                valid = 1;
            } else {
                System.out.println("Senha reprovada! Tente novamente.\n");
                valid = 0;
            }
        } while (valid == 0);
    }
}

//Gabriel Antonio Santos Pires