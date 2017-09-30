package CarFactory;

public class CarDoor {
    public String doorstatus;
    public String windowstatus;

    public CarDoor(){
        doorstatus="Closed";
        windowstatus="Closed"; }
        public String opendoor(){

        }
    public static void main (String []args){
        CarDoor mycardoor = new CarDoor();
        mycardoor.opendoor();
    }
}
