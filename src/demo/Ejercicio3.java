package demo;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String args[]){
        System.out.println("Ingrese un digito");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(esPrimo(a)){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }

        sc.close();
    }

    public static boolean esPrimo(int numero){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0)
                primo = false;
            else{
                 contador++;
            }
        }
        return primo;
    }
}
