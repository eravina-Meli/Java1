package demo;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        /* Desarrollar un programa para mostrar los primeros n múltiplos de m, siendo n y m valores que el usuario
        ingresará por consola.
        Recordá que un número n es múltiplo de m si n es divisible por m.*/

        System.out.println("Ingrese cantidad de numeros enteros N:");
        int cantidad = sc.nextInt();
        System.out.println("Ingrese el multiplo:");
        int multiplo = sc.nextInt();

        if(cantidad>0) {
            multiplos(cantidad, multiplo);
        }
        sc.close();

    }

    public static void multiplos(int cantidad, int multiplo){
        int nums =0;
        for(int i=0; nums < cantidad ; i++){
            if(i%multiplo == 0){
                System.out.println(i);
                nums++;
            }
        }
    }

}
