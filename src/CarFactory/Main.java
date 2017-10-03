package CarFactory;

public class Main {
    public static void main(String []args){
        CarDoor mycardoor = new CarDoor();
        CarDoor mycardoor2 = new CarDoor("closed","opened");
        mycardoor2.opendoor("opened");
        mycardoor2.closedoor("closed");
        mycardoor2.ifitwillwork("opened");
        mycardoor2.openwindow("opened");
        mycardoor2.closewindow("closed");
                mycardoor2.ifitwillworkwithwindow("opened");
        mycardoor2.show();

        CarWheel mycarwheel = new CarWheel();
        CarWheel mycarwheel2 = new CarWheel(0.5);
        mycarwheel2.swapwheel(1);
        mycarwheel2.brakewheel(0.4);
        mycarwheel2.show();

        CarEngine mycarengine = new CarEngine();
        CarEngine mycarengine2 = new CarEngine("car");
        mycarengine2.speednew(20);
        mycarengine2.pluspass(3);
        mycarengine2.goaway(0);
        mycarengine2.indexdoor(2);
        mycarengine2.indexwheel(3);
        mycarengine2.deletewheels();
        mycarengine2.newwheels(4);
        mycarengine2.maxspeednew();
        mycarengine2.show();
    }
}
