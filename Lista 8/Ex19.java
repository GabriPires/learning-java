import java.util.Random;

class Ex19 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] z = new int[10];
        int aux = 0;

        for (int i = 0; i < z.length; i++) {
            z[i] = rd.nextInt(10) + 1;
            System.out.print(z[i] + ", ");
        }

        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < (z.length - 1); j++) {
                if (z[j] > z[j + 1]) {
                    aux = z[j];
                    z[j] = z[j + 1];
                    z[j + 1] = aux;
                }
            }
        }
        System.out.print("\n");
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i] + ", ");
        }
    }
}

//Gabriel Antonio Santos Pires