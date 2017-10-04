package CarFactory;

public class CarWheel {
    public double wheel;
    public CarWheel() {
        double wheel = 1;
    }
    public CarWheel(double a) {
    this.wheel=a;
    }
    public void swapwheel(double a) {
        this.wheel=a;
    }
public double brakewheel (double a){
        double b = 1;
        double c = b-a;
        this.wheel=c;
    return b;
}
    public void show(){
        System.out.println("Статус шины "+wheel+"\n");
    }
}
