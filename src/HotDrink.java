public class HotDrink extends Product{
    int temperature;
    double volume_ml;
    public HotDrink(String name, double price, int temperature, double volume) {
        super(name, price);
        this.temperature = temperature;
        this.volume_ml = volume;
    }

    @Override
    public String toString() {
        return "\n"+name +" - temp: "+ temperature +" C, vol: " + volume_ml +" ml , cost: "+ price;
    }
}
