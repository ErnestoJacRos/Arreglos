/*Aquí solo estamos imprimiendo al inverso, pero, el arreglo sigue estando de la misma forma  */
import java.security.SecureRandom;
import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        /*String[] productos = new String[7];
        productos[0]= "Kingston Pendrive 64GB";
        productos[1]= "Samsung Galaxy ";
        productos[2]= "Disco Duro SSD Samsung Externo";
        productos[3]= "Asus Notebook";
        productos[4]= "Macbook Air";
        productos[5]= "ChromeCast 4ta generación";
        productos[6]= "Bicicleta Oxford";*/

        String[] productos = {"Kingston Pendrive 64GB",
                              "Samsung Galaxy ",
                              "Disco Duro SSD Samsung Externo",
                              "Asus Notebook",
                              "Macbook Air",
                              "ChromeCast 4ta generación",
                             "Bicicleta Oxford"};
        Arrays.sort(productos);

       newTopic("Usando For");
        for (int indice = 0; indice < productos.length; indice++) {
            System.out.println("productos " + indice + " = " + productos[indice]);
        }

        newTopic("For inverso");
        for (int indice = 0; indice < productos.length; indice++) {
            System.out.println("productos "+ (productos.length-1-indice) +" = " + productos[productos.length-1-indice]);
        }

        newTopic("For Inverso Dos");
        for (int indice = productos.length - 1; indice >= 0 ; indice--) {
            System.out.println("productos " + indice + " = " + productos[indice]);
        }


        }
        public static void newTopic(String topic){
        System.out.println("\n=============" + topic + "==============");
    }
}
