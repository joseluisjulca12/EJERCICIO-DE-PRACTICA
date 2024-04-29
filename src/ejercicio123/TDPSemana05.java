/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio123;

import java.util.Scanner;

/**
 *
 * @author Jose Luis
 */
public class TDPSemana05 {
    public static void main(String[] args) {
        //numeroMenor();
        //aritmetica();
        utilidades();
    }
    public static void numeroMenor() {
        //Declarar Variables
        int num1, num2, num3, menor;
        Scanner leerNumero = new Scanner(System.in);       
        System.out.println("=====BIENVENIDO A LA SEMANA 05=====");
        System.out.println("Ingrese primer numero:");
        num1 = leerNumero.nextInt();
        System.out.println("Ingrese segundo numero:");
        num2 = leerNumero.nextInt();
        System.out.println("Ingrese tercer numero:");
        num3 = leerNumero.nextInt();
        if(num1<num2)
        {
            menor=num1;
        }else{
            menor=num2;
        }
        if(num3<menor)
        {
            menor = num3;
        }
        System.out.println("El número menor es: "+menor);        
    }

    public static void aritmetica(){
        int num1, num2;
        double resultado;
        Scanner leerNumero = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        num1= leerNumero.nextInt();
        System.out.println("Ingrese el segudonumero:");
        num2= leerNumero.nextInt();
        if(num1==num2)        
        {
            resultado=num1*num2;
        }
        else{
            if(num1>num2)
            {
                resultado=num1-num2;
            }else{
                resultado=num1+num2;
            }
        }
        System.out.println("El resultado es : "+resultado);
    }
    
    public  static void utilidades(){
        int sueldo;
        double ant, utilidad;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el sueldo actual del trabajador:");
        sueldo = leer.nextInt();
        System.out.println("Ingrese la antiguedad del trabajador:");
        ant=leer.nextDouble();
        if(ant<1)
        {
            utilidad=sueldo*5/100;
        }else{
            if(ant<2)
            {
                utilidad=sueldo*7/100;
            }else{
                utilidad=sueldo*10/100;
            }
        }
        System.out.println("La utilidad del trabajador es: "+utilidad);
    }
}
