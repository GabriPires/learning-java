import java.util.Random;

class Ex8 {
    public static void main(String[] args) {
        Random rd = new Random();
        int f[] = new int[5];
        int soma = 0;

        for (int i = 0; i < f.length; i++) {
            f[i] = rd.nextInt(10) + 1;
            System.out.print(f[i] + " ");
            if (f[i] % 2 != 0) {
                soma += f[i];
            }
        }

        if (soma != 0) {
            System.out.println("\nSoma dos impares: " + soma);
        } else {
            System.out.println("\nNão existiu impar no vetor");
        }
    }
}

//Gabriel Antonio Santos Pires