package seminarOOP_1;

public class BottleOfMilk extends Product {

    protected double volume; // объем
    protected int fatСontent; // Содержание жирности


    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getFatСontent() {
        return fatСontent;
    }

    public void setFatСontent(int fatСontent) {
        this.fatСontent = fatСontent;
    }

    public BottleOfMilk(String brand, String name, double price, double volume, int fatСontent) {
        super(brand, name, price);
        this.volume = volume;
        this.fatСontent = fatСontent;
    }

    @Override
    public String displayInfo() {
        return String.format("[Бутылка] %s - %s - %f [объем: %f; жирность: %d]", brand, name, price, volume, fatСontent);
    }
}
