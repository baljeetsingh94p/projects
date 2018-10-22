
package assg14;

import java.util.Scanner;
public class Assg14 {

   
   
  public static void main(String[] args) {
       
    int studentCount , subjectCount ,i,j;
    System.out.print("How many Students:(rows)? ");
    Scanner keyboard=new Scanner(System.in);
    studentCount=keyboard.nextInt();
    System.out.print("How many Subjects:(coloumns)? ");
    subjectCount=keyboard.nextInt();
    // array declare
    int[][] marks=new int[studentCount][subjectCount];
    
    
    for(i=0;i<studentCount;i++)
    {
        System.out.println("Student: "+(i+1));
        for(j=0;j<subjectCount;j++)
        {
            System.out.print("Mark "+(j+1)+": ");
             marks[i][j]=keyboard.nextInt();
        }
    }
    
    for(i=0;i<studentCount;i++){
        //Line
        for(j=0;j<subjectCount;j++){
        System.out.print("|-----");
        }
        System.out.println("|");
        //Marks
         for(j=0;j<subjectCount;j++){
             System.out.print(String.format("| %3d ",marks[i][j]));
         }
         System.out.println("|");
    }
   for(i=0;i<subjectCount;i++){
        
        System.out.print("|-----");
   }
        System.out.println("|"); 
}}
 

