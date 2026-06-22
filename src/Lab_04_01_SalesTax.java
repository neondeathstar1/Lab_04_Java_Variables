public class Lab_04_01_SalesTax {
    public static void main(String[] args) {
        double purchasePrice = 45;
        double salesTaxRate = .05;
        double salesTax = purchasePrice * salesTaxRate;
        double totalPrice = purchasePrice + salesTax;

        System.out.println("Purchase price: $" + purchasePrice);
        System.out.println("Sales tax (5%): $" + salesTax);
        System.out.println("Total price: $" + totalPrice);
    }}
