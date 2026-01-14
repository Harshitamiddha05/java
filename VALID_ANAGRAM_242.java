import java.util.Scanner;
class VALID_ANAGRAM_242 {
    public boolean isAnagram(String s,String t){
        int slen=s.length();
        int tlen=t.length();
        if(slen!=tlen)
          return false;
        int[] count=new int[26];
        for(int i=0;i<slen;i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<tlen;i++){
            count[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(count[i]!=0)
               return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.next();
        System.out.println("Enter 2nd String:");
        String t=sc.next();
        VALID_ANAGRAM_242 obj=new VALID_ANAGRAM_242();
        if(obj.isAnagram(s, t))
            System.out.println("Anagram");
        else
           System.out.println("Not Anagram");
        sc.close();
    }
}