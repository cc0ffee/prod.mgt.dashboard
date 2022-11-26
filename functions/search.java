package functions;
import java.util.ArrayList;
import java.util.Scanner;
public class search {
    public static void searchProduct(ArrayList<item> Products) {
        /* 
        From main menu, asks user to input product name, then it will sarch the product in the list.
        If product is found, returns information of it, if not, product is not found is printed.
        Prompts to keep searching or to return to main menu
        */
        Scanner input = new Scanner(System.in);
        boolean searching = true; 
        while (searching) {
            String info = "No Product is found"; // default return unless product was found
            System.out.println("Input the name of product: ");
            String term = input.next();
            for (int i = 0; i < Products.size(); i++) {
                if (term.toLowerCase().equals(Products.get(i).getName().toLowerCase())) {
                    info = Products.get(i).toString();
                    System.out.println(Products.get(i).toString()); // changes info from no product found to information of product
                }
            }
            System.out.println(info);
            System.out.println("Keep searching? (Y/N): ");
            char code = input.next().charAt(0);
            if (code == 'n' || code == 'N') {
                searching = false; // makes it return to main menu
            }
        }
    }
}