package model;

public class Item {
    private int id;
    private String description;
    private float price;
    private int stock;


    public Item(){
        id = 0;
        description = "";
        price = 0;
        stock = 0;
    }

    public Item(int id, String description, float price, int stock) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    /**
     * getters and setters
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getTotalPrice (float price, int stock)
    {
        float totalPrice = price * stock;
        return  totalPrice;
    }

    /**
     * toString()
     */


    public String toString() {
        return "Item{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", Total Price=" + (price * stock)+
                '}';
    }
}
