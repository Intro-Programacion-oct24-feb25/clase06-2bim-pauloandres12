/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cuantas operaciones quiere realizar");
        int valor = entrada.nextInt();
        int[] resultados = new int[valor];

        int a = 0;
        int b = resultados.length;

        while (a < b) {
            try {
                System.out.println("Ingrese el primer valor");
                int valor1 = entrada.nextInt();
                System.out.println("Ingrese el segundo valor");
                int valor2 = entrada.nextInt();

                int resultado = valor1 / valor2;

                resultados[a] = resultado;

                a = a + 1;

            } catch (ArithmeticException e) {
                System.out.printf("(ArithmeticException) Ocurrió una "
                        + "excepción %s\n", e);
            } catch (InputMismatchException e) {
                System.out.printf("(InputMismatchException) Ocurrió una "
                        + "excepción %s\n", e);
                entrada.nextLine();
            } catch (Exception e) {
                System.out.printf("Ocurrió una excepción %s\n", e);
            }
        }
        for (int i = 0; i < resultados.length; i++) {
            System.out.printf("El resultado de la division %d es: %d\n",
                    i + 1,
                    resultados[i]);
        }
    }
}

/*Realizar un proceso repetitivo que permita realizar la división de 
        números ingresados por teclado; el resultado de cada división debe ir 
        almacenandose en cada posición del arreglo. Considerar las excepciones
        posibles*/
