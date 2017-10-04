package CarFactory;

public class CarDoor {
    public String doorstatus;
    public String windowstatus;
    public String o="opened";

    public CarDoor() {
        doorstatus = "Closed";
        windowstatus = "Closed";
    }
    public CarDoor (String a,String b) {
        this.doorstatus = a;
        this.windowstatus = b;
    }
    public void opendoor(){
        this.doorstatus = "opened";
    }
    public void closedoor(){
        this.doorstatus = "closed";
    }
    public String ifitwillwork(String a){
        String o="opened";

        if(a.equals(o)){
            doorstatus = "closed";
        } else{
         doorstatus = "opened";
        }
    return doorstatus;}

        public void openwindow(){
            this.doorstatus = "opened";
    }
    public void closewindow(){
        this.doorstatus = "closed";
    }
public void ifitwillworkwithwindow(String b){
        if(b.equals(o)){
            doorstatus="closed";
        }else {
            doorstatus = "opened";
        }
}

    public void show(){
        System.out.println("Статус дверей "+doorstatus);
        System.out.println("Статус окон "+windowstatus+"\n");
    }
}
