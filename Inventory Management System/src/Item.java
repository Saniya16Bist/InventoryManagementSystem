
public abstract class Item {
    private String itemId;
    private String itemName;
    private int quantity;
    private double price;
    private String category;

    public Item(String itemId, String itemName, int quantity, double price, String category) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double calculateValue() {
        return quantity * price;
    }

    public abstract void displayInfo();

    public abstract String toFileString();
}