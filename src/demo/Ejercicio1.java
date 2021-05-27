package demo;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int a = scan.nextInt();

        if(a > 0){
            CalcularNumerosPares(a);
        }


        scan.close();
    }

    public static void CalcularNumerosPares(int a){
        int numerosPares =0;
        for (int i=1; numerosPares < a; i++){
            if(i%2==0){
                System.out.println(i);
                numerosPares++;
            }
        }

    }
}
