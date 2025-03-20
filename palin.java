import java.util.*;
public class palin
{
    public static boolean palindrome(String str)
    {
        String s="";
        int l=str.length();
        for(l=l-1;l>=0;l--)
        {
           s=s+str.charAt(l);
        }
        return s.equals(str);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String word;
        System.out.println("Enter a sentence:");
        word=sc.nextLine();
        System.out.println("palindrome words are:");
        for(String str:word.split(" "))
        {
            if(palindrome(str))
           {
            System.out.println(str);
           }
        }
    }
}