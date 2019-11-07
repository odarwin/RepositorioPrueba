/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Darwin
 */
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String palabra;
        int num;
        char letra;
        double decimal;
        palabra=JOptionPane.showInputDialog("ingrese una palabra: ");
        num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        letra=JOptionPane.showInputDialog("ingrese un caracter").charAt(0);
        decimal=Double.parseDouble(JOptionPane.showInputDialog("digite un decimal: "));
        JOptionPane.showMessageDialog(null, "la palabra es: "+palabra);
        JOptionPane.showMessageDialog(null, "el numero es: "+num);
        JOptionPane.showMessageDialog(null, "el caracter es: "+letra);
        JOptionPane.showMessageDialog(null, "el decimal es: "+decimal);
        
        
        
        
        
    }
    
}
