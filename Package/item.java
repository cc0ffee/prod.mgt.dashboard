package Package;

public class item {
    private String category;
    private String name;
    private String brand;
    private double price;
    private int expDate;
    private boolean status;

    public item(String category, String name, String brand, double price, int expDate, boolean status) {
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.expDate = expDate;
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getExpDate() {
        return expDate;
    }

    public boolean getStatus() {
        return status;
    }

    public String toString() {
        return "Category: "+category+ "\nName: "+name+ "\nBrand: "+brand + "\nPrice: $"+ String.format("%.2f", price) +"\nExpiration Date: "+ expDate +" days" + "\nStatus: "+ (status? "In-store":"Sold out");
    }
}