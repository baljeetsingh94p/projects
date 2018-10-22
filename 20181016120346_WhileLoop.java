
package whileloop;

import java.util.Random;
import java.util.Scanner;


public class WhileLoop {
   

  
    public static void main(String[] args) {
        Random a=new Random();
        Scanner keyboard=new Scanner(System.in);
        
        int i;
        int number;
        int inputNumber;
        i=a.nextInt(800);

        System.out.println("how many numbers");
                number=keyboard.nextInt();
                for (i=0;i<number;i++)
                {
                    inputNumber=i;
                            if(inputNumber%2==0)
           {
               System.out.println(inputNumber +" EVEN");
           }
           else
           {
                   System.out.println(inputNumber +" ODD");
                   }
                }
        
        
        
        
        
    }}
           
     /*  int inputNumber=1;
       //while(inputNumber<=1024)
       for(inputNumber=1;inputNumber<=1024;inputNumber++)
       {
           if(inputNumber%2==0)
           {
               System.out.println(inputNumber +" EVEN");
           }
           else
           {
                   System.out.println(inputNumber +" ODD");
                   }
           //inputNumber++;
                   }
    }
    
}
*/