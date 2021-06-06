package org.ex10;
// problem on subtotal
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex10 {
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    public static void main(String[] args) {
        Scanner price = new Scanner(System.in);
        Scanner quantity = new Scanner(System.in);





        System.out.print("Enter the price of item 1: ");
        double price_1 = price.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        double quantity_1 = quantity.nextInt();
        System.out.print("Enter the price of item 2: ");
        double price_2 = price.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        double quantity_2 = quantity.nextInt();
        System.out.print("Enter the price of item 3: ");
        double price_3 = price.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        double quantity_3 = quantity.nextInt();

        double subtotal = (quantity_1 * price_1) + (quantity_2 * price_2) + (quantity_3 * price_3);
        System.out.print("Subtotal: " + df2.format(subtotal));
        double tax = subtotal * 0.055;
        System.out.print("\nTax: "+ df2.format(tax));
        double total = subtotal + tax;
        System.out.print("\nTotal: " + df2.format(total));






    }
}
