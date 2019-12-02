import java.util.Random;
import java.util.Scanner;

class Ex15 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Insira o tamanho do vetor S: ");
            num = sc.nextInt();
            if(num <= 0 || num > 10){
                System.out.println("Valor invalido tente novamente");
            }
        } while (num <= 0 || num > 10);
        int s[] = new int[num];

        do {
            System.out.print("Insira o tamanho do vetor T: ");
            num = sc.nextInt();
            if(num <= 0 || num > 15){
                System.out.println("Valor invalido tente novamente");
            }
        } while (num <= 0 || num > 15);
        int t[] = new int[num];

        num = s.length + t.length;
        int u[] = new int[num];

        for (int i = 0; i < t.length; i++) {
            t[i] = rd.nextInt(10) + 1;
        }

        for (int i = 0; i < s.length; i++) {
            s[i] = rd.nextInt(10) + 1;
        }

        System.out.print("S ");
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + ", ");
        }
        System.out.print("\nT ");
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + ", ");
        }

        int conts = 0, contt = 0;
        System.out.print("\nU ");
        for (int k = 0; k < u.length;) {
            if (conts < s.length) {
                u[k++] = s[conts];
                conts++;
            }
            if (contt < t.length) {
                u[k++] = t[contt];
                contt++;
            }
        }

        for (int i = 0; i < u.length; i++) {
            System.out.print(u[i] + ", ");
        }
    }
}

//Gabriel Antonio Santos Pires