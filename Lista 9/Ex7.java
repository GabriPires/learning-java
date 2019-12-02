import java.util.Random;

class Ex7 {
    public static void main(String[] args) {
        Random rd = new Random();
        int n = 0, m = 0, menor = 0, maior = 0, lmaior = 0, cmaior = 0, lmenor = 0, cmenor = 0;

        n = rd.nextInt(10) + 1;
        m = rd.nextInt(10) + 1;

        int[][] e = new int[n][m];

        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[0].length; j++) {
                e[i][j] = rd.nextInt(50) + 1;
                System.out.print(e[i][j]+" ");
                if (i == 0 && j == 0) {
                    maior = e[i][j];
                    menor = e[i][j];
                    lmaior = i + 1;
                    cmaior = j + 1;
                    lmenor = i + 1;
                    cmenor = i + 1;
                }
                if (e[i][j] > maior) {
                    maior = e[i][j];
                    lmaior = i + 1;
                    cmaior = j + 1;
                }
                if (e[i][j] < menor) {
                    lmenor = i + 1;
                    cmenor = j + 1;
                    menor = e[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("Maior: "+maior+"\nPosicao: linha "+lmaior+" coluna: "+cmaior);
        System.out.println("Menor: "+menor+"\nPosicao: linha "+lmenor+" coluna: "+cmenor);
    }
}

//Gabriel Antonio Santos Pires