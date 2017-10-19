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
public class Stars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner se = new Scanner (System.in);
       
        System.out.println("please enter numbers of Rows: ");
        
        int  n =  se.nextInt();
        
//        for(int r=0;r<=3;r++)
//       // { 
//         //  for(int space=3 ; space<=0 ;space--){
//         //       System.out.print(" ");}
//                
//                for(int c=0;c<=6;c=r+1)){//(n+space)= nober of coulumes 
//            
//                  System.out.print("*");
//                  
//                  }
//                //System.out.print(" ");
//                
//              
//            
//            //}
//           System.out.println("");
//        
for (int i = 0; i < n; i++) {
    
    for(int s=i;s<n-1;s++)
    System.out.print(" ");
    
         for (int j = 0; j < i*2+1; j++) //  عدد فردي = i*2+1
                System.out.print("*");
             System.out.println(" ");   
            }

            
}
            
        }
      

        
      
  
    
   
