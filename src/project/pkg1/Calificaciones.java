/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1;

import java.util.Scanner;

/**
 *
 * @author Darwin
 */
public class Calificaciones {
    public static void main(String [] args){
        float participacion=0;
        float primerExamenParcial=0;
        float segundoExamenParcial=0;
        float examenFinal=0;
        Scanner sc=new Scanner(System.in);        
        System.out.println("ingrese la nota de Participacion: ");
        participacion=sc.nextFloat();
        System.out.println("ingrese la nota de Primer Examen Parcial: ");
        primerExamenParcial=sc.nextFloat();
        System.out.println("ingrese la nota de Segundo Examen Parcial ");
        segundoExamenParcial=sc.nextFloat();
        System.out.println("ingrese la nota de Examen Final ");
        examenFinal=sc.nextFloat();
       participacion*=0.10f;
       primerExamenParcial*=0.25f;
       segundoExamenParcial*=0.25f;
       examenFinal*=0.40f;
       float total=participacion+primerExamenParcial+segundoExamenParcial+examenFinal;
        System.out.println("la calificacion final es: "+total);
       
        
        
    }
}
