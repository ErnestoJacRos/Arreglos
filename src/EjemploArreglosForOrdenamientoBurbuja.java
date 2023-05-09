
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
/*Ordenamiento Burbuja para ordenar */
public class EjemploArreglosForOrdenamientoBurbuja {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        String[] productos = {"Kingston Pendrive 64GB",
                              "Samsung Galaxy ",
                              "Disco Duro SSD Samsung Externo",
                              "Asus Notebook",
                              "Macbook Air",
                              "ChromeCast 4ta generación",
                             "Bicicleta Oxford"};
        Integer[] numeros = new Integer[10];
       // Arrays.sort(productos);
        // arregloInverso(productos);
       // Collections.reverse(Arrays.asList(productos));
        for (int indice = 0; indice < numeros.length; indice++) {
            numeros[indice] = random.nextInt(1000);
        }


        ordenarBurbuja(numeros);
        ordenarBurbuja(productos);
        for(Integer numero : numeros){
            System.out.println("numero = " + numero);
        }



        System.out.println("\n================other for ================");
        for (String producto: productos){
            System.out.println("producto = " + producto);
        }
       // System.out.println("Contador = " + contador);

    }

    public static void arregloInverso(String[] arreglo){
        int total = arreglo.length;
        for (int indice = 0; indice < total/2; indice++) {
            String actual = arreglo[indice];
            String ultimo = arreglo[total-1 - indice];
            arreglo[indice] = ultimo;
            arreglo[total-1-indice] = actual;
        }
    }

    public static void ordenarBurbuja(Object[] arreglo){
        int total = arreglo.length;
        int contador = 0;
        for (int indice = 0; indice < total -1; indice++) {
            for (int indice2 = 0; indice2 < total - 1 - indice; indice2++) {
                if (((Comparable)arreglo[indice2 +1]).compareTo(arreglo[indice2]) < 0){
                    Object aux = arreglo[indice2];
                    arreglo[indice2] = arreglo[indice2+1];
                    arreglo[indice2+1] = aux;
                }
                contador++;
            }
        }

    }
}
