import java.security.SecureRandom;
import java.util.Arrays;

public class EjemploArreglosFor {
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

       newTopic("Usando For");
        for (int indice = 0; indice < productos.length; indice++) {
            System.out.println("productos[indice] = " + productos[indice]);
        }

        newTopic("Usando ForEach");
        for (String producto : productos){
            System.out.println("prodcuto = " + producto);
        }

        newTopic("Usando While");
        int indice = 0;
        while (indice < productos.length){
            System.out.println("productos[indice] = " + productos[indice]);
            indice++;
        }
        newTopic("Usando DoWhile");
        indice = 0;
        do {
            System.out.println("productos[indice] = " + productos[indice]);
            indice++;
        }while (indice < productos.length);



        int[] numeros = new int[5];
        for ( indice = 0; indice < numeros.length; indice++) {
            numeros[indice]  = random.nextInt(100000);
        }

        Arrays.sort(numeros);

        for (indice = 0; indice < numeros.length; indice++) {
            System.out.println(numeros[indice]);
        }
    }

    public static void newTopic(String topic){
        System.out.println("=============" + topic + "==============");
    }
}
