import model.Item;

public class Main {
    public static void main(String[] args) {
        Item newItem = new Item(1,"lala", 123, 2);
        System.out.println(newItem.toString());
    }
}