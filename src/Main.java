public class Main {
    public static void main(String[] args) {
        Product tovar1 = new Chocolette("Mars", 12000);
        Product tovar2 = new Chocolette("Twix", 12000);
        Product tovar3 = new Milk("Nestle", 10000);
        Product tovar4 = new Milk("Lactel", 8000);
        ProductSeller avtomat1 = new ProductSeller();
        avtomat1.initProducts(tovar1);
        avtomat1.initProducts(tovar2);
        avtomat1.initProducts(tovar3);
        avtomat1.initProducts(tovar4);
        System.out.println(avtomat1.getList());
        avtomat1.getProduct("Twix");
        HotDrinkMachine drinkGiver = new HotDrinkMachine();
        Product tovar5 = new HotDrink("Latte", 500, 85, 200);
        Product tovar6 = new HotDrink("Americano", 600, 90, 225);
        Product tovar7 = new HotDrink("Kapuccino", 700, 80, 150);
        drinkGiver.initProducts((tovar5));
        drinkGiver.initProducts((tovar6));
        drinkGiver.initProducts((tovar7));
        System.out.println(drinkGiver);
        drinkGiver.getProduct("Latte");
    }
}