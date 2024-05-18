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
public class ejercicio02 {
    public static void main(String[] args) {
        int N, divisible;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        N = leer.nextInt();
        for (int i = 1; i <= N; i++) {
            int divisibles = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) 
                {
                    divisibles++;
                }
            }
            if (divisibles<3) {
                System.out.println(i + " es primo");
            }
        }
    }
}