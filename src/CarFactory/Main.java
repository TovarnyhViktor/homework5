package CarFactory;

public class Main {
    public static void main(String []args){
        CarDoor mycardoor = new CarDoor();
        CarDoor mycardoor2 = new CarDoor("closed","opened");
        mycardoor2.opendoor("opened");
        mycardoor2.closedoor("closed");
        mycardoor2.ifitwillwork("opened");
        
        mycardoor2.show();
    }
}
