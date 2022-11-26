package functions;
import java.util.Scanner;
import java.util.ArrayList;
public class category {
    public static void listCategory(ArrayList<item> Products) {
        ArrayList<String> category = new ArrayList<String>();
        for (int i = 0; i < Products.size(); i++) {
            String selectedItem = Products.get(i).getCategory();
            if (!category.contains(selectedItem.toLowerCase())) {
                category.add(selectedItem);
            }
        }
        Scanner input = new Scanner(System.in);
        boolean listing = true;
        while (listing) {
            if (category.size() == 0) {
                System.out.println("No categories to search through....");
                listing = false;
                break;
            }
            System.out.println("Pick from these categories:");
            for (int i = 0; i < category.size(); i++) {
                System.out.println((i+1) + ". " + category.get(i));
            }
            int selected_number = input.nextInt();
            while (selected_number < 1 || selected_number > category.size()) {
                System.out.println("Please input correct number to a category: ");
                selected_number = input.nextInt();
            }
            ArrayList<item> selectedCategory = new ArrayList<item>();
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
                while (selected_number < 0 || selected_number > category.size()) {
                    System.out.println("Please input correct number:");
                    selected_number = input.nextInt();
                }
                if (selected_number == 0) {
                    inCategory = false;
                } 
                else {
                    System.out.println(selectedCategory.get(selected_number-1).toString());
                    System.out.println("Select in category again? (Y/N): ");
                    char code = input.next().charAt(0);
                    if (code == 'n' || code == 'N') {
                        inCategory = false; // makes it return to main menu
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