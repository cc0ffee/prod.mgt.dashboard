package functions;
import java.util.ArrayList;
import java.util.Scanner;

public class client {
    
    public static void main(String[]args) {
        ArrayList<item> Products = new ArrayList<item>();
        item Apple = new item("Fruits","Apple", "Red", 2.99, 44, true);
        Products.add(Apple);
        Scanner sc = new Scanner(System.in);
        //item temp = new item(null, null, null, 0, 0, false);
        System.out.println("Welcome to the Product Management System!");
        int direction = 1; 
        while (direction != 0) {
            System.out.println("Input 1 to add product\nInput 2 to search product\nInput 3 to categorize products\nInput 0 to exit the system");
            direction = sc.nextInt();
            while (direction < 0 || direction > 4) {
                System.out.println("Error!\nInput 1 to add product\nInput 2 to search product\nInput 3 to categorize products\nInput 0 to exit the system");
                direction = sc.nextInt();
            }
            switch(direction) {
                case 1:
                Products = add.addProduct(Products);
                System.out.println(Products.get(0).getName());
                break;
                case 2: 
                search.searchProduct(Products);
                break;
                case 3:
                category.listCategory(Products);
                break;
            }

        }
    }
}