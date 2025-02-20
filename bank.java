import java.util.Scanner;
public class bank
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  float p,r,a=0.0f;
  int n,ch;
  System.out.println("Enter your choice:\n1-Term Deposit\n2-Recurring Deposit\nChoice:");
  ch=sc.nextInt();
  switch(ch)
  {
   case 1:
        {
        System.out.println("Enter the Principal:");
        p=sc.nextFloat();
        System.out.println("Enter the Rate of Interest:");
        r=sc.nextFloat();
        System.out.println("Enter the Time period:");
        n=sc.nextInt();
        a=p*(1 + r / 100)*n;
        System.out.println("Maturity Amount:"+a);
        break;
        }
   case 2:
        {
        System.out.println("Enter the Principal:");
        p=sc.nextFloat();
        System.out.println("Enter the Rate of Interest:");
        r=sc.nextFloat();
        System.out.println("Enter the Time period:");
        n=sc.nextInt();
        a=(p *n) +( p *( n*(n + 1) )/ 2) * (r / 100) * (1 / 12);
        System.out.println("Maturity Amount:"+a);
        break;
        }
   default:
        System.out.println("Invalid Input!");
        break;
  }
 }       
}  
  
  