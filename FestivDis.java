import java.util.Scanner;
public class FestivDis {
    public static double calcDiscPrice(double tCost) {
        double dis;
        if (tCost< 2000) {
            dis = 5;
        } else if (tCost>= 2001 &&tCost<= 5000) {
            dis = 25;
        } else if (tCost>= 5001 &&tCost<= 10000) {
            dis = 35;
        } else {
            dis = 50;
        }
        double disAmount = (tCost * dis) / 100;
        return tCost - disAmount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total cost of items purchased: ");
        double tCost = sc.nextDouble();
        double amountToPay = calcDiscPrice(tCost);
        System.out.printf("Amount to be paid after discount: ₹%.2f\n", amountToPay);
    }
}

