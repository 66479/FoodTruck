package Package18;

import java.util.Scanner;

public class Menu {
    public double subTotal;
    public static double runningTotal;
    private static double itemPrice;
    static boolean ordering = true;
    static Scanner input = new Scanner(System.in);
public static double tax = .005; 
    public static void menu() {
        System.out.println("Welcome \n1. Burger ($5.00) \n2. HotDog ($2.50) \n3. Brat ($3.50) \n4. Fries ($2.00)\n5. Soda ($2.00) \n6. water ($0) \n7. Done");
    }

    public static double itemPrice(int foodItem) {
        if (foodItem == 1) {
            // burger= $5.00
            System.out.println("You've ordered a burger");
            itemPrice = 5.00;
            itemPrice+=itemPrice*tax;
        }
        if (foodItem == 2) {
            // HotDog = $2.50
            System.out.println("You've ordered a HotDog");
            itemPrice = 2.50; 
            itemPrice+=itemPrice*tax;
        }
        if (foodItem == 3) {
            // Brat = $3.50
            System.out.println("You've ordered a Brat");
            itemPrice = 3.50;
            itemPrice+=itemPrice*tax;
        }
        if (foodItem == 4) {
        	System.out.println("You've ordered fries");
        	itemPrice = 2.00;
        	itemPrice+=itemPrice*tax;
        }
        if (foodItem == 5) {
        	System.out.println("You've ordered a soda");
        	itemPrice = 2.00;
        	itemPrice+=itemPrice*tax;
        if (foodItem == 6) {
        	System.out.println("You've ordered water");
        	itemPrice = 0.00;	
        	itemPrice+=itemPrice*tax;
        	
        }
        }
        quantity();
        return itemPrice;
    }

    public static double quantity() {
        System.out.println("Enter quantity");
        double quantity = input.nextDouble();
        subTotal(quantity, itemPrice);
        return quantity;
    }

    public static double subTotal(double quantity, double itemPrice) {
        double subTotal = quantity * itemPrice;
        System.out.println("Subtotal: " + subTotal);
        return subTotal;
    }

    public static void done(double runningTotal) {
        ordering = false;
        System.out.println(runningTotal);
        System.out.println("Enjoy your meal");
    }
    
    public static void main(String[] args) {
        int menuOption;
        int foodItem = 0;
        input = new Scanner(System.in);
        do {
            double runningTotal = 0;
            menu();
            menuOption = input.nextInt();
            switch (menuOption) {
            case 1:
                foodItem = 1;
                itemPrice(foodItem);
                break;
            case 2:
                foodItem = 2;
                itemPrice(foodItem);
                break;
            case 3:
                foodItem = 3;
                itemPrice(foodItem);
                break;
            case 4:
                foodItem = 4;
                itemPrice(foodItem);
                break;
            case 5:
            	foodItem = 5;
            	itemPrice(foodItem);
            	break;
            case 6:
            	foodItem = 6;
            	itemPrice(foodItem);
            case 7:
                done(runningTotal);
                break;
            default:
                System.out.println("Invalid option.");
            }
        } while (ordering);
        {
            subTotal(quantity(), itemPrice(foodItem));
            runningTotal = runningTotal + subTotal(quantity(), itemPrice(foodItem));
        }
    }
}


