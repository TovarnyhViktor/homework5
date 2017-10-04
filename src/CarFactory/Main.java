package CarFactory;

public class Main {
    public static void main(String []args){
        CarDoor mycardoor = new CarDoor();
        CarDoor mycardoor2 = new CarDoor("closed","opened");
        mycardoor2.opendoor();
        mycardoor2.closedoor();
        mycardoor2.ifitwillwork("opened");
        mycardoor2.openwindow();
        mycardoor2.closewindow();
        mycardoor2.ifitwillworkwithwindow("opened");
        mycardoor2.show();

        CarWheel mycarwheel = new CarWheel();
        CarWheel mycarwheel2 = new CarWheel(0.5);
        mycarwheel2.swapwheel(1);
        double s=mycarwheel2.brakewheel(0.4);
        mycarwheel2.show();

        CarEngine mycarengine = new CarEngine();
        CarEngine mycarengine2 = new CarEngine("v6",280,15,5,2,60.0);
        mycarengine2.speednew(20);
        mycarengine2.pluspass();
        mycarengine2.goaway(0);
        mycarengine2.indexdoor(2);
        mycarengine2.indexwheel(3,s);
        mycarengine2.deletewheels();
        mycarengine2.newwheels(4);
        mycarengine2.maxspeednew(s);
        mycarengine2.show();
    }
}
