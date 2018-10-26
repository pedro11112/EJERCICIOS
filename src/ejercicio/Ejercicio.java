/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.Arrays;
import java.util.Scanner;

/*
Ejercicio : 1. En una cadena de supermercados, se aplican descuentos sobre el monto final,
dependiendo de ciertas condiciones.
a) Si el monto final es de más de $500, se aplica un 5% de descuento.
b) Si el medio de pago es “Efectivo” o “Débito”, se aplica un 10% de descuento.
c) Si el cliente forma parte de la comunidad, y además es lunes, se aplica un 10%
de descuento.
Todas las promociones son acumulables. Ej: Si el cliente gastó $600 y paga con débito, se le aplicará un descuento del 15%.
 */
public class Ejercicio {

    static void Array() {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int min = 100000;
        int max = -100000;

        System.out.print("Digite los elementos del arreglo: ");
        numero = entrada.nextInt();
        
        int[] numeros = new int[numero];

        for (int i = 0; i < numero; i++) {
            System.out.print(i + 1 + ". Digite un caracter: ");
            numeros[i] = entrada.nextInt();
        }
        System.out.println("\nLos numeros son: ");
        for (int i = 0; i < numero; i++) {
            System.out.println(numeros[i] + " ");

        }
    }

    static int obtener_mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return obtener_mcd(b, a % b);
        }
    }

    static void entrada() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese numero mayor: ");
        int numero = entrada.nextInt();

        System.out.println("Ingrese numero mayor: ");
        int numero1 = entrada.nextInt();

        System.out.println("El MCD es: " + obtener_mcd(numero, numero1));

    }

    /*
    Dados 10 números enteros, visualizar la suma de los números pares de 
    la lista. El numero de pares y la media de los impares. 
     */
    static void ejercico19() {
        Scanner entrada = new Scanner(System.in);
        int numero, suma1 = 0, suma = 0;
        int numeros_pares = 0;
        int numeros_impares = 0;
        float mediaimpares;

        int[] numeros = {10, 1, 5, 4, 2, 8, 1, 3, 6, 9};

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(i + 1 + ". Digite un caracter: ");
            numeros[i] = entrada.nextInt();

            if (numeros[i] % 2 == 0) {
                suma1 += numeros[i];
                numeros_pares++;
            } else {
                suma += numeros[i];
                numeros_impares++;
            }
        }

        mediaimpares = suma / numeros_impares;
        System.out.println("La suma de los pares es: " + suma1 + "\nEl numero es pares es:  " + numeros_pares + "\nLa media de los impares es: " + mediaimpares);

    }

    static void ecuacionCuadratica() {
        Scanner entrada = new Scanner(System.in);
        int a, b, c;
        System.out.print("Ingrese el valor a A: ");
        a = entrada.nextInt();
        System.out.print("Ingrese el valor a B: ");
        b = entrada.nextInt();
        System.out.print("Ingrese el valor a C: ");
        c = entrada.nextInt();

        double determinante = Math.pow(b, 2) - (4 * a * c);
        if (determinante > 0) {
            double x1 = ((b * (-1)) + Math.sqrt(determinante)) / (2 * a);
            double x2 = ((b * (-1)) - Math.sqrt(determinante)) / (2 * a);
            System.out.println("El valor de x1= " + x1 + " y el valor de x2= " + x2);
        } else {
            System.out.println("El determinante es negativo y no se puede completar la operacion");
        }
    }

    /*
    Leer tres números del teclado y deducir si se han introducido en orden 
    creciente. 
     */
    static void creciente() {
        Scanner entrada = new Scanner(System.in);
        int a, b, c;
        System.out.print("Ingrese el primer numero: ");
        a = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        b = entrada.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        c = entrada.nextInt();
        if (a < b && a < c && b < c) {
            System.out.println("Los numeros estan en orden creciente.");
        } else {
            System.out.println("Los numeros no estan en orden creciente.");
        }
    }

    public static void main(String[] args) {
    }
}
