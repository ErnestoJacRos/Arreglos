public class EjemploArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] ns = new int[10];
        for (int indice = 0; indice < numeros.length; indice++) {
            numeros[indice] = indice+1;
        }
        int aux = 0;
        for (int indice = 0; indice < numeros.length /2; indice++) {
            //System.out.print(numeros[indice] + " " );
            //System.out.println(numeros[numeros.length-1 - indice]);
            ns[aux++] = numeros[indice];
            ns[aux++] = numeros[numeros.length-1-indice];

        }

        for (int num : ns){
            System.out.println("num = " + num);
        }
    }
}
