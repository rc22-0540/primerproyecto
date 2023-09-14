import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1- Identificar variables
        int a, b, total;
        Scanner S = new Scanner(System.in);


        //2- imprimir el mensaje ¨ingrese a¨
        System.out.println("ingrese a");

        //3- Leer y almacenar valor en variable a
        a = S.nextInt();

                //4- imprimir el mensaje ¨ingrese b¨
                System.out.println("ingrese b");

        // 5- Leer y almacenar variable b
        b = S.nextInt();

        //6- total = a * b;
        total = a * b;

        //7- imprimir el mensaje ¨El resultado es¨
        // al valor total
        System.out.println("El resultado es" + total);
    }
}