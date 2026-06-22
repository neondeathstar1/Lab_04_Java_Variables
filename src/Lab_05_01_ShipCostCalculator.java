import java.util.Scanner;

public class Lab_05_01_ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // itemPrice=0; shippingCost=0; totalPrice=0
        double itemPrice = 0;
        double shippingCost = 0;
        double totalPrice = 0;

        //output "Enter the price of the item: "
        System.out.print("Enter the price of the item: 50 ");

        //input itemPrice
        itemPrice = in.nextDouble();

        // if itemPrice >= 100 then
        //    shippingCost = 0
        // else
        //    shippingCost = itemPrice * 0.02
        // end if
        if (itemPrice >= 100.0) {
            shippingCost = 0.0;
        } else {
            shippingCost = itemPrice * 0.02;
        }

        // totalPrice = itemPrice + shippingCost
        totalPrice = itemPrice + shippingCost;

        // output "Shipping cost: $" + shippingCost
        System.out.println("Shipping cost: $" + shippingCost);

        // output "Total price: $" + totalPrice
        System.out.println("Total price: $" + totalPrice);
    }
}