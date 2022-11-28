package functions;
import java.util.Scanner;
import java.util.ArrayList;
public class category {
    public static void listCategory(ArrayList<item> Products) {
        /* 
        From main menu, show all available categories in current list and let user choose one category.
        With chosen category, it will show all products under this category to which the user can view product details of if choose to.
        After listing products, users can either list another category or return to main menu
        */
        ArrayList<String> category = new ArrayList<String>(); // New array to store the different categories
        for (int i = 0; i < Products.size(); i++) {
            String selectedItem = Products.get(i).getCategory();
            if (category.contains(selectedItem)) { // checks if category is already in list, so there are no repeats
                category.add(selectedItem);
            }
        }
        Scanner input = new Scanner(System.in);
        boolean listing = true;
        while (listing) {
            if (category.size() == 0) { // returns to main menu because there are no products
                System.out.println("No categories to search through....");
                listing = false;
                break;
            }
            System.out.println("Pick from these categories:");
            for (int i = 0; i < category.size(); i++) {
                System.out.println((i+1) + ". " + category.get(i));
            }
            int selected_number = input.nextInt();
            while (selected_number < 1 || selected_number > category.size()) { // user inputs number out of the options
                System.out.println("Please input correct number to a category: ");
                selected_number = input.nextInt();
            }
            ArrayList<item> selectedCategory = new ArrayList<item>(); // new array to keep list of products in current category
            for (int i = 0; i < Products.size(); i++) {
                if (Products.get(i).getCategory().toLowerCase().equals(category.get(selected_number-1).toLowerCase())) {
                    selectedCategory.add(Products.get(i));
                }
            }
            boolean inCategory = true;
            while(inCategory) {
                System.out.println("Products in this category:");
                for (int i = 0; i < selectedCategory.size(); i++) {
                    System.out.println((i+1) + ". " + selectedCategory.get(i).getName());
                }
                System.out.println("Choose a product for more details, or enter 0 exit category");
                selected_number = input.nextInt();
                while (selected_number < 0 || selected_number > category.size()) { // user inputs number out of the options
                    System.out.println("Please input correct number:");
                    selected_number = input.nextInt();
                }
                if (selected_number == 0) {
                    inCategory = false; // returns to exit menu choice
                } 
                else {
                    System.out.println(selectedCategory.get(selected_number-1).toString()); // shows product details that was chosen
                    System.out.println("Select in category again? (Y/N): ");
                    char code = input.next().charAt(0);
                    if (code == 'n' || code == 'N') {
                        inCategory = false; // makes it return to category choice
                    }
                }
            }
            System.out.println("Want to list another category? (Y/N): ");
            char code = input.next().charAt(0);
            if (code == 'n' || code == 'N') {
                    listing = false; // makes it return to main menu
            }
        }
    }
}