
package assignment.pkg11;
import java.util.Scanner;
public class Assignment11 {

    
    public static void main(String[] args) {
        int x;
        int i;
        int j;
        System.out.println("HOW MANY LINES?");
        Scanner input=new Scanner(System.in);
        x=input.nextInt();
        for(i=1;i<=x;i++)
        {
                for (j=1;j<=i;j++)
                {
                         System.out.print("*");
                }
                     System.out.println(" ");
    }
         System.out.println("END OF EXECUTION");
}}
