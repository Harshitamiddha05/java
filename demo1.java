import java.util.Scanner;
abstract class shape
{
    abstract void setData(Scanner scanner) ;
    abstract double calc();
}

class rec extends shape 
{
    int l,b;
    void setData(Scanner scanner) 
    { 
       System.out.println("Enter length and breadth:");
       this.l = scanner.nextInt();
        this.b = scanner.nextInt();
    }
    
    double calc() 
    {
        return l*b;
    }
}   

class Circle extends shape
{
    float r ;
    void setData(Scanner scanner) 
    { 
       System.out.println("Enter radius:");
       this.r = scanner.nextFloat();
    }
    double calc() 
    {
       return Math.PI *r*r;
    }
}
class square extends shape 
{ 
    int s;
     void setData(Scanner scanner) 
    { 
       System.out.println("Enter side:");
       this.s = scanner.nextInt();
    }
    double calc() 
    {
       return (s*s);
    }
}

public class demo1
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        shape f = new rec();
        f.setData(scanner);
        System.out.println(f.calc());
        shape c = new Circle();
        c.setData(scanner);
        System.out.println(c.calc());
        shape d=new square();
        d.setData(scanner);
        System.out.println(d.calc());
    }
}