/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session1;

/**
 *
 * @author Aya
 */
import java.util.Scanner;
public class grades {
    public static void main(String[] args) {
    Scanner se = new Scanner (System.in);
       
        System.out.println("please enter your score  from 0 to 100:  ");
        int  g =  se.nextInt();
        if (g<0||g>100){
            System.out.println("You enterd wrong grade ");
        
        }
        
        
        if (g<=100&&g>=90){
            System.out.println("youre grade is : A ");
        }else if(g>=80&&g<90 ) {
            System.out.println("youre grade is : B ");
        
           }else if(g>=70&&g<80 ) {
            System.out.println("youre grade is : c ");
           
           }else if(g>=60&&g<70 ) {
            System.out.println("youre grade is : f ");
            }else if(g>=0&&g<60 ){
            System.out.println("youre grade is : Raseb  ");
            

            }
          
        
}
        
            
        
        
        
    
}
