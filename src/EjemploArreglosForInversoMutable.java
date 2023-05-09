/* aquí ya estamos mutando el arreglo, no solo estamos imprimiendo al revés el arreglo ya está al revés*/
import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
    public static void main(String[] args) {
        String[] productos = {"Kingston Pendrive 64GB",
                              "Samsung Galaxy ",
                              "Disco Duro SSD Samsung Externo",
                              "Asus Notebook",
                              "Macbook Air",
                              "ChromeCast 4ta generación",
                             "Bicicleta Oxford"};
        Arrays.sort(productos);
            arregloInverso(productos);
        Collections.reverse(Arrays.asList(productos));
        System.out.println("\n================other for ================");
        for (String producto: productos){
            System.out.println("producto = " + producto);
        }

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
}
