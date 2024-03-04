import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductSeller {
    public List<Product> list = new ArrayList<>();
    public void initProducts(Product product){
        list.add(product);
        System.out.println("Товар загружен! ");
    }
    public void getProduct(String name){
        for (Product product : list){
            if (product.name.equals(name)){
                System.out.println(product);
            }
        }

    }
    public ProductSeller() {
        System.out.println("Создан продуктовый автомат!");
    }

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "{" +
                "list=" + list +
                '}';
    }


}

