/*Program to replace all 0's with 1 in a given integer. Given an integer as an input, all the 0's in the number has to be replaced with 1.
For example, consider the following number
Input: 102405
Output: 112415
Steps to replace all 0's with 1 in a given integer
•	Input the integer from the user.
•	Traverse the integer digit by digit.
•	If a '0' is encountered, replace it by '1'.
•	Print the integer.
*/
import java.util.Scanner;
public class Replace
{
 public static void main(String args[])
 {
  int num,dig,res=0,place=1;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the number:");
  num=sc.nextInt();
  while(num>0)
  {
   dig=num%10;
   if(dig==0)
   {
    dig=1;
   }
    res=(dig*place)+res;
    place=place*10;
    num=num/10;
  } 
  System.out.println("Updated number:"+res);
 } 
}  