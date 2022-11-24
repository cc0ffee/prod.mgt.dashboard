package Package;

import java.util.ArrayList;
import java.util.Scanner;

public class client {
    
    public static void main(String[]args) {
        ArrayList<item> Products = new ArrayList<item>();
        Scanner sc = new Scanner(System.in);
        
        item temp = new item(null, null, null, 0, 0, false);

        System.out.println("Welcome to the Product Management System!");
        int direction = clientOption();
        while (direction != 0) {
            int option;
            if (direction == 1) {
                temp = addProduct();
                Products.add(temp);
                option = repeat();
                if (option == 1)
                    direction = 1;
                else
                    direction = clientOption();
            }
        }
    }

    public static int clientOption() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 1 to add product\nInput 2 to search product\nInput 3 to categorize products\nInput 0 to exit the system");
        int direction = sc.nextInt();
        while (direction < 0 || direction > 4) {
            System.out.println("Error!\nInput 1 to add product\nInput 2 to search product\nInput 3 to categorize products\nInput 0 to exit the system");
            direction = sc.nextInt();
        }
        return direction;
    }

    public static item addProduct() {
        char confirmation;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the category of the product>");
        String category = sc.next();
        System.out.println("Confirm? (Y/N)");
        confirmation = sc.next().charAt(0);
        while (confirmation != 'Y') {
            System.out.println("Enter the category again>");
            category = sc.next();
            System.out.println("Confirm? (Y/N)");
            confirmation = sc.next().charAt(0);
        }

        System.out.println("Enter the name of the product>");
        String name = sc.next();
        System.out.println("Confirm? (Y/N)");
        confirmation = sc.next().charAt(0);
        while (confirmation != 'Y') {
        System.out.println("Enter the name again>");
            name = sc.next();
            System.out.println("Confirm? (Y/N)");
            confirmation = sc.next().charAt(0);
        }

        System.out.println("Enter the type/brand of the product");
        String brand = sc.next();
        System.out.println("Confirm? (Y/N)");
        confirmation = sc.next().charAt(0);
        while (confirmation != 'Y') {
            System.out.println("Enter the type/brand again>");
            brand = sc.next();
            System.out.println("Confirm? (Y/N)");
            confirmation = sc.next().charAt(0);
        }

        System.out.println("Enter the price of the product");
        double price = sc.nextDouble();
        System.out.println("Confirm? (Y/N)");
        confirmation = sc.next().charAt(0);
        while (confirmation != 'Y') {
            System.out.println("Enter the price again>");
            price = sc.nextDouble();
            System.out.println("Confirm? (Y/N)");
            confirmation = sc.next().charAt(0);
        }

        System.out.println("Enter the expiration period of the product(between 0 and 365 days)>");
        int expDate = sc.nextInt();
        System.out.println("Confirm? (Y/N)");
        confirmation = sc.next().charAt(0);
        while (confirmation != 'Y') {
            System.out.println("Enter the expiration period again>");
            expDate = sc.nextInt();
            System.out.println("Confirm? (Y/N)");
            confirmation = sc.next().charAt(0);
        }

        System.out.println("Enter the status of the product(T for in-store & F for sold-out)>");
        char status = sc.next().charAt(0);
        while (status != 'T' && status != 'F') {
            System.out.println("Error! Enter the status again>");
            status = sc.next().charAt(0);
            System.out.println("Confirm? (Y/N)");
            confirmation = sc.next().charAt(0);
            while (confirmation != 'Y') {
                System.out.println("Enter the status again>");
                status = sc.next().charAt(0);
                System.out.println("Confirm? (Y/N)");
                confirmation = sc.next().charAt(0);
            }
        }
        
        boolean _status = status == 'T'? true:false;

        item Product = new item(category, name, brand, price, expDate, _status);
        System.out.println("The product is added successfully!");
        return Product;
    }

    public static int repeat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nInput 1 to add another product\nInput 2 to return to main menu");
        int direction = sc.nextInt();
        while (direction != 1 && direction !=2 ) {
            System.out.println("Error!\nInput 1 to add another product\nInput 2 to return to main menu");
            direction = sc.nextInt();
        }
        return direction;
    }
}