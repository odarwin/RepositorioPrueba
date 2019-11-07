/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainProjects;

import java.util.Scanner;
import project.pkg1.Account;

/**
 *
 * @author Darwin
 */
public class MainAccount {
    public static void main(String[]args){
        Account myAccount=new Account("DARWIN");
        
        System.out.printf("Initial name is: %s%n",myAccount.getName());
        
        System.out.println("Please enter the name ;");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        myAccount.setName(name);
        System.out.printf("Final name is: %s%n", myAccount.getName());
        
    }
}
