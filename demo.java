/*write a java program to take a value on length and breadth of rectangle from user and check whether it is a square or not.(using two different classes)*/
import java.util.Scanner;
class shape
{
 void check(float len,float brea)
 {
  if(len==brea)
    System.out.println("It is a Square.");
  else
    System.out.println("It is a Rectangle.");
 }
}
public class demo
{
 public static void main(String args[])
 {
  float len,brea;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Length and Breadth:");
  len=sc.nextFloat();
  brea=sc.nextFloat();
  shape s=new shape();
  s.check(len,brea);
 }
}

  
  
  