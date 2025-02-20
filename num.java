/*write a program to input four numbers (integer,float) and compute Addition,Subtraction,Multiplication,and division using user input (using command line argument)*/
public class num
{
 public static void main(String args[])
 {
  int n1=Integer.parseInt(args[0]);
  int n2=Integer.parseInt(args[1]);
  float n3=Float.parseFloat(args[2]);
  float n4=Float.parseFloat(args[3]);
  System.out.println("Addition:"+(n1+n2));
  System.out.println("subtraction:"+(n1-n2));
  System.out.println("Multiplication:"+(n3*n4));
  System.out.println("Division:"+(n3/n4));
 }
}
