/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.de.refuerzo;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class Ejercicios {
    public static void main(String[] args) {
      int N;
      Scanner leer = new Scanner(System.in);
      System.out.print("Ingrese un número: ");
      N = leer.nextInt();
      for (int i = 0; i < N; i = i + 2) {
            System.out.println(i);
        }
    }
}
       
