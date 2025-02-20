/*Write a program to calculate factorial of a number*/
import java.util.Scanner;
public class fact
{
 public static void main(String args[])
 {
  int num;
  int fac=1;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the number:");
  num=sc.nextInt();
  for(int i=1;i<=num;i++)
  {
   fac*=i;
  }
  System.out.println("factorial of "+num+":"+fac);
 }
} 
