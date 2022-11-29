package functions;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
public class client {
    public static void main(String[]args) throws FileNotFoundException {
        /*
        The product management system is here! It creates a list called Products to keep track of all products in a system.
        The main menu is command-line, where users can input their information and choices in the command-line.
        Users can add, search, and categorize products in this system through its menus.
        */
        ArrayList<item> Products = new ArrayList<item>(); // New array of products in system
        Scanner s = new Scanner(new File("testdocument.txt")); // preset items / testing document
        while (s.hasNext()){
            String line = s.next();
            ArrayList<String> list = new ArrayList<>(Arrays.asList(line.split(",")));
            item NewProduct = new item(list.get(0),list.get(1),list.get(2),list.get(3),list.get(4),list.get(5)); 
            Products.add(NewProduct);
        }
        s.close();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Product Management System!");
        int direction = 1; 
        while (direction != 0) {
            System.out.println("Input 1 to add product\nInput 2 to search product\nInput 3 to categorize products\nInput 0 to exit the system");
            direction = sc.nextInt();
            while (direction < 0 || direction > 4) { // user inputs number out of the options
                System.out.println("Error!\nInput 1 to add product\nInput 2 to search product\nInput 3 to categorize products\nInput 0 to exit the system");
                direction = sc.nextInt();
            }
            switch(direction) { // based on direction, choose which case to execute
                case 1:
                Products = add.addProduct(Products);
                System.out.println(Products.get(0).getName());
                break; // breaks will return to the start of the while loop, which is the main menu
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