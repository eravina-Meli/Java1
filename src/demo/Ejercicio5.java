package demo;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Desarrollar un programa para mostrar por consola los primeros n números naturales que tienen al
        menos m dígitos d, siendo n, m y d valores que el usuario ingresará por consola.
        Por ejemplo: si el usuario ingresa n=5, m=2 y d=3, el programa deberá mostrar por consola los primeros 5
        números naturales que tienen, al menos, 2 dígitos 3.
        En este caso la salida será: 33, 133, 233, 303, 313.
*/

        System.out.println("Ingrese la cantidad de caracteres que se deben mostrar:");
        int cantidadChars = sc.nextInt();
        System.out.println("Digite la cantidad numeros iguales que queremos tener");
        int numeroDigitos = sc.nextInt();//2
        System.out.println("Digite el numero a tener en cuenta:");
        int aTenerEnCuenta = sc.nextInt();//3

        calcular(cantidadChars,numeroDigitos,aTenerEnCuenta);


        sc.close();
    }

    public static void calcular(int cantidadNumeros, int numeroDiguitos, int numRepetido) {
        int contador = 0;
        int i = 1;

        while (contador < cantidadNumeros) {

            String num = Integer.toString(i);
            char[] ch = num.toCharArray();

            int contadorRepeticiones = 0;
            for (char c : ch) {
                if (Character.getNumericValue(c) == numRepetido) {
                    contadorRepeticiones++;
                }
            }

            if (contadorRepeticiones == numeroDiguitos) {
                System.out.println(i);
                contador++;
            }
            i++;
        }
    }
}
