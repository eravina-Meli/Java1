package demo;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cantidad de numeros primos a mostrar");
        int a = sc.nextInt();

        ReturnPrimos(a);
        sc.close();
    }

    public static void ReturnPrimos (int numero){

        for (int i = 0; i < numero; i++) {
            if (i != numero && i%numero==0) {
                System.out.println("No es numero primo");
            }else {
                System.out.println(i);
                i++;
                }
            }
        }
    }
