/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainProjects;

import java.util.Scanner;
import project.pkg1.Cuenta;

/**
 *
 * @author Darwin
 */
public class MainCuenta {
    public static void main(String [] args){
        Cuenta cuenta=new Cuenta("Darwin",20000.50f);
        Scanner sc=new Scanner(System.in);
        System.out.println("Cuanto vas a ingresar?: ");
        cuenta.ingresar(sc.nextFloat());
        System.out.println("Cuanto vas a retirar?: ");
        cuenta.retirar(sc.nextFloat());
        
        //MOSTRANDO RESULTADOS FINALES
        
        System.out.println("Tu cuenta tiene este monto: "+cuenta.getCantidad());
    }
}
