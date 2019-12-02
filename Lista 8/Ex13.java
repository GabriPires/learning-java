import java.util.Random;
import java.util.Scanner;

class Ex13 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int num;

        do{
            System.out.print("Insira o tamanho do vetor P: ");
            num = sc.nextInt();
            if(num<=0||num>10){
                System.out.println("Valor invalido tente novamente");
            }
        }while(num<=0||num>10);
        int p[] = new int[num];

        do{
            System.out.print("Insira o tamanho do vetor Q: ");
            num = sc.nextInt();
            if(num<=0||num>15){
                System.out.println("Valor invalido tente novamente");
            }
        }while(num<=0||num>15);
        int q[] = new int[num];

        num = p.length + q.length;
        int r[] = new int[num];

        for (int i = 0; i < q.length; i++) {
            if (i < p.length) {
                p[i] = rd.nextInt(10) + 1;
            }
            q[i] = rd.nextInt(10) + 1;
        }

        System.out.print("P ");
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i] + ", ");
        }
        System.out.print("\nQ ");
        for (int i = 0; i < q.length; i++) {
            System.out.print(q[i] + ", ");
        }

        int contp = 0, contq = 0;
        System.out.print("\nR ");
        for (int i = 0; i < r.length; i++) {
            if (i < p.length) {
                r[i] = p[contp];
                contp++;
            } else {
                r[i] = q[contq];
                contq++;
            }
            System.out.print(r[i] + ", ");
        }
    }
}

//Gabriel Antonio Santos Pires