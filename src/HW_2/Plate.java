package HW_2;

public class Plate {
    private int food;


    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood(){
        setFood(getFood() + 10);
    }



    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }
}
