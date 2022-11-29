CS201 Term Project, by Kacper Stasik(A20510470) and Zibin Chen(A20507621)
# Product Management System
__State-of-the-art CLI to keep track of all products in a store!__

## Operational Documentation
### Main Menu
Prompted with choice for each function of the system. Enter number with the corresponding action
```
Welcome to the Product Management System!
Input 1 to add product
Input 2 to search product
Input 3 to categorize products
Input 0 to exit the system
```

### `Option 1` Add Products
User is asked to input the details the new product they are adding. The user can keep adding products until they are done before returning to main menu
```
Enter the category of the product>
> Dairy 
Confirm? (Y/N)
> Y
Enter the name of the product>
> Milk
Confirm? (Y/N)
> Y
Enter the type/brand of the product
> Low-Fat 
Confirm? (Y/N)
> Y
Enter the price of the product
> 3.49
Confirm? (Y/N)
> Y
Enter the expiration period of the product(between 0 and 365 days)>
> 80
Confirm? (Y/N)
> Y
Enter the status of the product(T for in-store & F for sold-out)>
> T

Want to add another product? (Y/N):
> N
```
### `Option 2` Search Products
User types a product to search for, and the system returns the product details if it exists
```
Input the name of product: 
> Apple
Category: Fruits
Name: Apple
Brand: Red
Price: $2.99
Expiration Date: 44 days
Status: In-store
Category: Fruits
Name: Apple
Brand: Red
Price: $2.99
Expiration Date: 44 days
Status: In-store
Keep searching? (Y/N):
> N
```
### `Option 3` Categorize Products
System displays all categories in the product list. Users can choose one category, view what products are in it, and choose to see product details. The user can keep listing categories until they are done before returning to main menu
```
Pick from these categories:
1. Fruits
2. Dairy
> 1
Products in this category:
1. Apple
Choose a product for more details, or enter 0 exit category
> 1
Category: Fruits
Name: Apple
Brand: Red
Price: $2.99
Expiration Date: 44 days
Status: In-store
Select in category again? (Y/N):
> N
Want to list another category? (Y/N):
> Y
Pick from these categories:
1. Fruits
2. Dairy
> 2
Products in this category:
1. Milk
Choose a product for more details, or enter 0 exit category
> 0
Want to list another category? (Y/N):
> N
```
### `Option 4` Exit
Exits the system

---

