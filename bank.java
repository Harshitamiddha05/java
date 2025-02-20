/*Using the switch statement, write a menu-driven program to calculate the maturity amount of a bank deposit.
The user is given the following options:
(i) Term Deposit
(ii) Recurring Deposit

For option (i) accept Principal (p), rate of interest (r) and time period in years (n). Calculate and output the maturity amount (a) receivable using the formula a = p[1 + r / 100]n.

For option (ii) accept monthly installment (p), rate of interest (r) and time period in months (n). Calculate and output the maturity amount (a) receivable using the formula a = p * n + p * n(n + 1) / 2 * r / 100 * 1 / 12.
For an incorrect option, an appropriate error message should be displayed.
[ Use Scanner Class to take input ] 
*/
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
  
  
