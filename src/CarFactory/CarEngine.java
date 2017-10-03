package CarFactory;

public class CarEngine {
    String data = "1990.05.20";
    String enginetype = "6v";
    int newspeed = 280;
    int timetomax = 15;
    int passagires = 5;
    int passagiresnow = 2;
    int speednow = 60;
    int Wheels = 4;
    int doors = 4;
    public CarEngine(){
        String data = "1990.05.20";
    }
    public CarEngine(String a){
        String enginetype = "6v";
        int newspeed = 280;
        int timetomax = 15;
        int passagires = 5;
        int passagiresnow = 2;
        int speednow = 60;
    }
        public void speednew(int b){
        this.newspeed=b;
    }
    public void pluspass(int t){
            this.passagiresnow=t;
    }
    public void goaway(int g){
        this.passagiresnow=g;
    }
    public void indexdoor (int d){

    }
    public void indexwheel (int u){

    }
    public void deletewheels (){
        this.Wheels=0;
    }
public void newwheels(int k){
    int b = this.Wheels;
    int c = k+b;
    this.Wheels=c;
}
public void maxspeednew(){
    if(this.passagiresnow==0){
        this.newspeed = 0;
    }

}
public void show(){
    System.out.println(data);
    System.out.println(enginetype);
    System.out.println(newspeed);
    System.out.println(timetomax);
    System.out.println(passagires);
    System.out.println(passagiresnow);
    System.out.println(speednow);
    System.out.println(Wheels);
    System.out.println(doors);
}
}
