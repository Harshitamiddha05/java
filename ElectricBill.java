import java.util.Scanner;
class ElectricBill{
    private String name;
    private int units;
    private double bill;
    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        name = sc.nextLine();
        System.out.print("Enter number of units consumed: ");
        units = sc.nextInt();
    }
    public void calc() {
        if (units <= 100) {
            bill = units * 2.00;
        } else if (units <= 300) {
            bill = (100 * 2.00) + ((units - 100) * 3.00);
        } else {
            bill = (100 * 2.00) + (200 * 3.00) + ((units - 300) * 5.00);
            bill += bill * 0.025;
        }
    }
    public void print() {
        System.out.println("\nElectric Bill Details:");
        System.out.println("Name of the Customer: " + name);
        System.out.println("Number of Units Consumed: " + units);
        System.out.printf("Bill Amount: ₹%.2f\n", bill);
    }
    public static void main(String[] args) {
        ElectricBill cust = new ElectricBill();
        cust.accept();
        cust.calc();
        cust.print();
    }
}
