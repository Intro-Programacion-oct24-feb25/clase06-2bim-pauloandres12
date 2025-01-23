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
        String cadena = "";
        Scanner entrada = new Scanner(System.in);

        while (bandera) {

            try {

                System.out.println("Ingrese un pais");
                String salida = entrada.nextLine();
                
                salida.toLowerCase();
                char letra = salida.charAt(0);

                if ((letra == 'a') || (letra == 'e') || (letra == 'i')
                        || (letra == 'o') || (letra == 'u')) {
                    bandera = true;
                    throw new Exception("Ingrese un pais que inicie con "
                            + "consonante");
                    
                } else {
                    cadena = salida;
                    bandera = false;
                }

            } catch (Exception e) {
                System.out.printf("Ocurrio una excepcion %s\n", e);
            
            }
            System.out.printf("%s\n", cadena);
        }
    }
}
