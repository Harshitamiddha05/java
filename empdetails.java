/*Create a Java program that does the following:
Define a class called Employee with the following attributes:
id (integer)
name (string)
salary (double)
Implement the following methods in the Employee class:
displayDetails(): Displays the employee's details.
increaseSalary(double percentage): Increases the employee's salary by the given percentage.
In the main() method:
Create an array of 2 Employee objects.
Accept user input for each employee’s details.
Display the details of all employees.
Ask the user for a percentage increase in salary, then apply the increment to all employees and display their updated details.*/
import java.util.Scanner;
class Employee{
    int id;
    String name;
    double salary;
    Employee(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    
    }
    void displayDetails()
    {
        System.out.println("ID:"+id);
        System.out.println("NAME:"+name);
        System.out.println("SALARY:"+salary);
    }
    void increaseSalary(double perc)
    {
        salary+=(salary*perc/100);
    }   
}
public class empdetails{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int id;
        String name;
        double salary,perc;
        Employee[] emp=new Employee[2];
        for(int i=0;i<emp.length;i++)
        {
            System.out.println("Enter the details of employee "+(i+1)+":");
            System.out.println("Enter id:");
            id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name:");
            name=sc.nextLine();
            System.out.println("Enter Salary:");
            salary=sc.nextDouble();
            emp[i]=new Employee(id,name,salary);
        }
        System.out.println("Enter the percentage to increase the salary:");
        perc=sc.nextDouble();
        for(int i=0;i<emp.length;i++)
        {
            emp[i].increaseSalary(perc);
        }
        System.out.println("Updated details of employee");
        for(int i=0;i<emp.length;i++)
        {
            System.out.println("Details of employee "+(i+1)+":");
            emp[i].displayDetails();
        }
        }
    }