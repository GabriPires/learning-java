import java.util.Random;

class Ex10 {
    public static void main(String[] args) {
        Random rd = new Random();
        int pa[] = new int[5];
        int pb[] = new int[5];
        int pc[] = new int[10];

        System.out.println("A | B");
        for (int i = 0; i < pa.length; i++) {
            pa[i] = rd.nextInt(10) + 1;
            pb[i] = rd.nextInt(10) + 1;
            pc[i] = pa[i];
            pc[i + 5] = pb[i];

            System.out.println(pa[i]+"|"+pb[i]);
        }

        System.out.println("C");
        for(int i=0;i<pc.length;i++){
            System.out.println(pc[i]);
        }
    }
}

//Gabriel Antonio Santos Pires