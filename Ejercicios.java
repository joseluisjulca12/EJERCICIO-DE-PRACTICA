package tdp04.refuerzo;

import java.awt.BorderLayout;
import java.time.Clock;
import java.util.Scanner;

public class Ejercicios {
    public void ejercicio3(){
        //Declarando Variables
        double lineaCredito=0;
        int tipoTarjeta=0;
        double deudaActual=0;
        String nombre="";
        //Leer datos
        System.out.println("========INCREMENTO DE LINEA========");
        System.out.print("Ingrese Nombre del Cliente: ");
        nombre=new Scanner(System.in).nextLine();
        System.out.println("");
        System.out.print("Ingrese Tipo de tarjeta: ");
        tipoTarjeta=new Scanner(System.in).nextInt();
        System.out.println("");
        System.out.print("Ingrese Linea de Credito Actual: ");
        lineaCredito=new Scanner(System.in).nextDouble();
        System.out.println("");
        System.out.print("Ingrese Deuda Actual: ");
        deudaActual=new Scanner(System.in).nextDouble();
        System.out.println("");
        //CALCULAR NUEVA lINEA DE CREDITO
        double incremento=0;
        switch (tipoTarjeta) {
            case 1:
                if(deudaActual>0){
                    incremento = lineaCredito*0.25/2;
                }else{
                    incremento = lineaCredito*0.25;
                }
                break;
            case 2:
                if(deudaActual>0)                {
                    incremento = lineaCredito*0.35/2;
                }else{
                    incremento = lineaCredito*0.35;
                }
                break;
            case 3:
                    incremento= lineaCredito*0.45;
                break;
            default:
                    incremento= lineaCredito*0.50;
                break;
        }
        lineaCredito=lineaCredito+incremento;
        System.out.println("Nueva linea de credito de : "+nombre+" es: "+lineaCredito);
    }
}
