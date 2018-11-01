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

    // Pide el tamano para el arreglo y cada uno de sus valores, luego lo retorna
    static int[] getArray() {
        Scanner entrada = new Scanner(System.in);
        int arraySize;

        System.out.print("Digite los elementos del arreglo: ");
        arraySize = entrada.nextInt();

        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            System.out.print(i + 1 + ". Digite un numero: ");
            array[i] = entrada.nextInt();
        }

        // no es necesario imprimirlo (imprimir es mostrarlo) de nuevo..
//        System.out.println("\nLos numeros son: ");
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println(numeros[i] + " ");
//        }
        return array;
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
        int acumuladorPares = 0, acumuladorImpares = 0;
        int numerosPares = 0;
        int numerosImpares = 0;
        float mediaImpares;

        // lo que retorna la función (método) 'getArray', se guarda en la variable 'numeros'
        int[] numeros = getArray();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                acumuladorPares += numeros[i];
                numerosPares++;
            } else {
                acumuladorImpares += numeros[i];
                numerosImpares++;
            }
        }

        mediaImpares = acumuladorImpares / numerosImpares;
        System.out.println("La suma de los pares es: " + acumuladorPares
                + "\nEl numero es pares es:  " + numerosPares
                + "\nLa media de los impares es: " + mediaImpares);

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

    /* 
    Dados dos números enteros realizar el algoritmo que calcule el cociente 
    y el resto (suponiendo que no existe los operadores para ello) 
     */
    static void restoYcociente() {
        Scanner entrada = new Scanner(System.in);

        int n1, n2;
        int resto, cociente = 0;

        System.out.print("Digite un numero: ");
        n1 = entrada.nextInt();
        System.out.print("Digite un numero: ");
        n2 = entrada.nextInt();

        while (n1 >= n2) {
            n1 = n1 - n2;
            cociente++;
        }
        System.out.println("El cociente es: " + cociente + " y el resto es: " + n1);

    }

    /*
    Calcular el máximo valor de una serie de 100 números.
     */
    static void maximoValor() {
        Scanner entrada = new Scanner(System.in);
        int max = -1000000;
        int[] maximo = {5, 4, 10, 2, 5};

        for (int i = 0; i < maximo.length; i++) {
            if (maximo[i] > max) {
                max = maximo[i];
            }
        }
        System.out.println("El numero maximo es: " + max);
    }

    static void maximoValor1() {
        Scanner entrada = new Scanner(System.in);
        int mayor, menor;
        int[] arreglo = {5, 4, 10, 2, 5};

        for (int i = 0; i < arreglo.length; i++) {

        }
        menor = mayor = arreglo[0];
        for (int j = 0; j < arreglo.length; j++) {
            if (arreglo[j] > mayor) {
                mayor = arreglo[j];
            }
            if (arreglo[j] < menor) {
                menor = arreglo[j];
            }
        }
        System.out.println("Elemento mayor es: \n" + mayor);
        System.out.println("Elemento menor es: \n" + menor);
    }

    /*
    Se introduce por teclado una hora determinada con el formato H, M, S. 
    Se pide calcular la hora que será dentro de un segundo. 
     */
    static void addSecondsToTimeBy() {
        Scanner entrada = new Scanner(System.in);
        int H, M, S;

        System.out.println("introduce la hora: ");
        H = entrada.nextInt();
        System.out.println("introduce los minutos: ");
        M = entrada.nextInt();
        System.out.println("introduce los segundos: ");
        S = entrada.nextInt();

        if (H >= 0 && H <= 23 && M >= 0 && M <= 59 && S >= 0 && S <= 59) {
            S++;
            if (S == 60) {
                S = 0;
                M++;
                if (M == 60) {
                    M = 0;
                    H++;
                    if (H == 24) {
                        H = 0;
                    }
                }
            }
            System.out.println("Un segundo despues la hora seria: " + H + ":" + M + ":" + S);
        } else {
            System.out.println("Introduzca una horra correcta.");
        }
    }

    /*
    Un capital C se coloca a un interés anual R. Al cabo de cuantos años se 
    doblará? 
     */
    static void interesFinal() {
        Scanner entrada = new Scanner(System.in);
        float veces = 0, interesdecimal, limite, base, operar, C, R, años = 0;
        System.out.print("Ingrese el capital: ");
        C = entrada.nextFloat();
        System.out.print("Ingrese el interes: ");
        R = entrada.nextFloat();

        interesdecimal = R / 100;
        limite = 2 * C;
        base = C;
        while (C <= limite) {
            operar = C * interesdecimal;
            C = C + operar;
            años++;
        }
        if (C > limite) {
            veces = C / base;
        }
        System.out.println("El interes tomaria " + años
                + " años en doblar su valor Y el capital final sera "
                + veces + " mas grande grande");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
    }
}
