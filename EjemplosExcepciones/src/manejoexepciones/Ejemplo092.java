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
public class Ejemplo092 {

    public static void main(String[] args) {
        boolean bandera = true;
        Scanner entrada = new Scanner(System.in);

        while (bandera) {

            try {
                String salida;
                char letra;

                System.out.println("Ingrese un pais que inicie con vocal");
                salida = entrada.nextLine();
                salida.toLowerCase();

                letra = salida.charAt(0);

                if ((letra == 'a') || (letra == 'e') || (letra == 'i')
                        || (letra == 'o') || (letra == 'u')) {
                    bandera = true;
                } else {
                    throw new Exception(salida);
                }

            } catch (Exception e) {
                System.out.printf("Ocurrio una excepcion %s\n", e);
                bandera = false;
            }
        }
    }
}
