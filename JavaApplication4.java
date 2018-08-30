/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author lab208
 */
public class JavaApplication4 {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Verificador();

    }
    static void Verificador(int Numero) {
        
        Scanner input = new Scanner(System.in);
        int a;
               
        System.out.println("Insira um número");
        a = input.nextInt();
        
        if (Numero >= 0) {
            System.out.println("O número inserido é positivo");
            
        }
        
        else System.out.println("O número inserido é negativo");
        
    }

    private static void Verificador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}