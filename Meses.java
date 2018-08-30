/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meses;

import java.util.Scanner;

public class Meses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Scanner input = new Scanner(System.in);
     int mes;
     
     
     mes=input.nextInt();
     
     while(mes<=12){
     switch(mes){
         case 1:
         System.out.println("Janeiro");
         mes=mes+1;
         break;
                  case 2:
         System.out.println("Fevereiro");
         mes=mes+1;
         break;
                  case 3:
         System.out.println("Marco");
         mes=mes+1;
         break;
                  case 4:
         System.out.println("Abril");
         mes=mes+1;
         break;
                  case 5:
         System.out.println("Maio");
         mes=mes+1;
         break;
                  case 6:
         System.out.println("Junho");
         mes=mes+1;
         break;
                  case 7:
         System.out.println("Julho");
         mes=mes+1;
         break;
                  case 8:
         System.out.println("Agosto");
         mes=mes+1;
         break;
                  case 9:
         System.out.println("Setembro");
         mes=mes+1;
         break;
                  case 10:
         System.out.println("Outubro");
         mes=mes+1;
         break;
                  case 11:
         System.out.println("Novembro");
         mes=mes+1;
         break;
                  case 12:
         System.out.println("Janeiro");
         mes=mes+1;
         break;
     }
     }
    }
    
}
