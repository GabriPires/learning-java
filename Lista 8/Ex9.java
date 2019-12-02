import java.util.Random;

class Ex9 {
    public static void main(String[] args) {
        Random rd = new Random();
        int g[] = new int[5];
        int h[] = new int[g.length];
        int cont = 0;

        for (int i = 0; i < g.length; i++) {
            g[i] = rd.nextInt(10) + 1;
            if (g[i] % 2 == 0) {
                h[i] = g[i];
                cont++;
            }
        }

        if (cont != 0) {
            for (int i = 0; i < h.length; i++) {
                if (h[i] != 0) {
                    System.out.print(h[i] + " ");
                }
            }
        } else {
            System.out.print("Vetor vazio");
        }

    }
}

//Gabriel Antonio Santos Pires