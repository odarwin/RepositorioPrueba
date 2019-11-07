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
public class math {
    public static void main(String [] args){
        int Guillermo=0;
        int Luis;
        int Juan;
        
        Scanner sc=new Scanner (System.in);
        System.out.println("ingresar la cantidad de guillermo: ");
        Guillermo=sc.nextInt();
        Luis=Guillermo/2;
        Juan=(Luis+Guillermo)/2;
        System.out.println("La suma total es: "+(Guillermo+Juan+Luis));
        
        
        
        
                
    }
}
