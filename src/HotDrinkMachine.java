import java.util.ArrayList;

public class HotDrinkMachine implements VendingMachine{
    ArrayList<Product> drinkList = new ArrayList<>();
    @Override
    public void initProducts(Product product) {
        drinkList.add(product);
        System.out.println("Напиток загружен!");
    }
    @Override
    public void getProduct(String name) {
        for (Product product : drinkList){
            if (product.name.equals(name)){
                System.out.println(product);
            }
        }
    }
    public HotDrinkMachine() {
        System.out.println("Создан автомат подающий напиток!");
    }
    @Override
    public String toString() {
        return "HotDrinkMachine" + drinkList;
    }
}
