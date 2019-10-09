/**
 * Ben Clark
 * Oct 9th 2019
 * This program prompts the user for an option to count to different numbers by different incriminates
 */
package loops;
import java.util.Scanner;


public class Loops {

    
    public static void main(String[] args) {
        int option = 0;
        //Prompts the user with all of the available options        
        Scanner keyedInput = new Scanner(System.in);
        System.out.println("Please enter your choice");
        System.out.println("1... Count from 0 to 10 by 1");
        System.out.println("2... Count from 100 to 0 by 10");
        System.out.println("3... Count from 50 to 500 by 50");
        System.out.println("4... Count from 6000 to 1000 by 1000");
        System.out.println("Please enter your choice");
        option = keyedInput.nextInt();
        //Checks the users input and outputs the counting that goes with the option chosen
        if(option==1){
             for( int i=0; i<=10;i++){
                 System.out.println(i);
                
           }
              System.out.println("You have chosen to count from 0 to 10 by 1");
        }
         if(option==2){
             for( int n=100; n>=0;n=n-10){
                 System.out.println(n);
                 
        }
             System.out.println("You have chosen to count from 100 to 0 by 10");
       }
         if(option==3){
             for( int j=50; j<=500;j=j+50){
                 System.out.println(j);
                 
        }
             System.out.println("You have chosen to count from 50 to 500 by 50");
       }
           if(option==4){
             for( int k=6000; k>=1000;k=k-1000){
                 System.out.println(k);
                
        }
              System.out.println("You have chosen to count from 6000 to 1000 by 1000");
       }
    }
    
}
