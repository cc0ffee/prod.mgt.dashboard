package functions;
import java.util.ArrayList;
import java.util.Scanner;
public class add {
    public static ArrayList<item> addProduct(ArrayList<item> Products) {
        /*
        When chosen, user is asked to put new product details one by one
        Once complete, product will be added to the already existing Products list
        User will then be asked if they want to add another product or exit to main menu
        NOTE: the Products list does not change in the main client until user returns to main menu
        */
        char confirmation;
        Scanner sc = new Scanner(System.in);
        boolean adding = true;
        while(adding) { 
            // Similar repeat for each step
            System.out.println("Enter the category of the product>"); //asks and accept input from user
            String category = sc.next();
            System.out.println("Confirm? (Y/N)");
            confirmation = sc.next().charAt(0); // gets char for Y/N decision
            while (confirmation != 'Y') { // When not confirmed, ask again
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
            while (status != 'T' && status != 'F') { // input has to be either T or F
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
            
            boolean _status = status == 'T'? true:false; // changes the string option T/F to a boolean
            item Product = new item(category, name, brand, price, expDate, _status); // makes new item
            Products.add(Product); // puts into already existing product list
            System.out.println("\nWant to add another product? (Y/N): ");
            char code = sc.next().charAt(0);
            if (code == 'n' || code == 'N') {
                adding = false; // makes it return to main menu
            }
        }
        return Products; // existing Products List + New Products
    }
}