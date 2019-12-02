import java.util.Random;

class Ex20 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] aa = new int[10];
        int aux = 0;

        for (int i = 0; i < aa.length; i++) {
            aa[i] = rd.nextInt(10) + 1;
            System.out.print(aa[i] + ", ");
        }

        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j < (aa.length - 1); j++) {
                if (aa[j] < aa[j + 1]) {
                    aux = aa[j];
                    aa[j] = aa[j + 1];
                    aa[j + 1] = aux;
                }
            }
        }
        System.out.print("\n");
        for (int i = 0; i < aa.length; i++) {
            System.out.print(aa[i] + ", ");
        }
    }
}

//Gabriel Antonio Santos Pires