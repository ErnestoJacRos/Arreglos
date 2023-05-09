public class EjemploArregloCombinado {
    public static void main(String[] args) {
        int[]a , b, c;
        a = new int[10];
        b = new int[10];
        int total = a.length + b.length;
        c = new int[total];
        for (int i = 0; i <a.length; i++) {
                 a[i] = i + 1 ;
        }

        for (int i = 0; i <a.length; i++) {
            b[i] = (i + 1) * 5;
        }
        int aux = 0;
        for (int i = 0; i < total/2; i++) {
            c[aux++] = a[i];
            c[aux++] = b[i];
        }
        for (int num : c){
            System.out.println(num);
        }
    }
}
