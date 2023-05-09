import java.security.SecureRandom;
import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        String[] productos = new String[7];
        productos[0]= "Kingston Pendrive 64GB";
        productos[1]= "Samsung Galaxy ";
        productos[2]= "Disco Duro SSD Samsung Externo";
        productos[3]= "Asus Notebook";
        productos[4]= "Macbook Air";
        productos[5]= "ChromeCast 4ta generación";
        productos[6]= "Bicicleta Oxford";
        Arrays.sort(productos);
        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);
        System.out.println("productos[5] = " + productos[5]);
        System.out.println("productos[6] = " + productos[6]);

        int[] numeros = new int[5];
        for (int indice = 0; indice < numeros.length; indice++) {
            numeros[indice]  = random.nextInt(100000);
        }
       Arrays.sort(numeros);

        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.println(numeros[indice]);
        }
    }
}
