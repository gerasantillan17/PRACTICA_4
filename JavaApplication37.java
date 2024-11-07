/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication37;

import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class JavaApplication37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       
        System.out.print("Introduce una cadena de texto: ");
        String cadena = scanner.nextLine();

      
        cadena = cadena.toLowerCase();

        System.out.println("Las vocales en la cadena son:");
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                System.out.print(caracter + " ");
            }
        }
    }
}
