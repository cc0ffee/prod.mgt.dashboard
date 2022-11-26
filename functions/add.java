package functions;
import java.util.ArrayList;
import java.util.Scanner;
public class add {
    public static ArrayList<item> addProduct(ArrayList<item> Products) {
        char confirmation;
        Scanner sc = new Scanner(System.in);
        boolean adding = true;
        while(adding) {
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
            Products.add(Product);
            System.out.println("\nWant to add another product? (Y/N): ");
            char code = sc.next().charAt(0);
            if (code == 'n' || code == 'N') {
                adding = false; // makes it return to main menu
            }
        }
        return Products;
    }
}