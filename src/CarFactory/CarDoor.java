package CarFactory;

public class CarDoor {
    public String doorstatus;
    public String windowstatus;

    public CarDoor() {
        doorstatus = "Closed";
        windowstatus = "Closed";
    }
    public CarDoor (String a,String b) {
        this.doorstatus = a;
        this.windowstatus = b;
    }
    public void opendoor(String a){
        this.doorstatus = a;
    }
    public void closedoor(String a){
        this.doorstatus = a;
    }
    public void ifitwillwork(String a){
        String o="opened";
        String c="closed";
        if(a.equals(o)){
            doorstatus = "closed";
        } else{
         doorstatus = "opened";
        }}

        public void openwindow(String b){
        this.doorstatus = b;
    }
    public void closewindow(String b){
            this.doorstatus = b;
    }
public void ifitwillworkwithwindow(String b){
        String o="opened";
        String c="closed";
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
