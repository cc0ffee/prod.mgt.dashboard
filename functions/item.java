package functions;

public class item {
    private String category;
    private String name;
    private String brand;
    private String price;
    private String expDate;
    private String status;

    public item(String category, String name, String brand, String price, String expDate, String status) {
        this.category = category;
        this.name = name;
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

    public String getPrice() {
        return price;
    }

    public String getExpDate() {
        return expDate;
    }

    public String getStatus() {
        return status;
    }

    public String toString() {
        return "Category: "+category+ "\nName: "+name+ "\nBrand: "+brand + "\nPrice: $"+ String.format("%.2f", Float.parseFloat(price)) +"\nExpiration Date: "+ expDate +" days" + "\nStatus: "+ (Boolean.parseBoolean(status)? "In-store":"Sold out");
    }
}