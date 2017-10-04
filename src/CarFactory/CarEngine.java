package CarFactory;

public class CarEngine {
    String data = "1990.05.20";
    String enginetype;
    double newspeed;
    int timetomax;
    int passagires;
    int passagiresnow;
    double speednow;
    int Wheels = 4;
    int doors = 4;
    double t;
    public CarEngine(){
        String data = this.data;
    }
    public CarEngine(String a,double b,int c,int d,int e,double f){
        enginetype = a;
        newspeed = b;
        timetomax = c;
        passagires = d;
        passagiresnow = e;
        speednow = f;
    }
        public void speednew(int b){
        this.newspeed=b;
    }
    public void pluspass(){
            passagiresnow=passagiresnow+1;
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
public void maxspeednew(double s){
    double t=s;
    if(this.passagiresnow==0){
        this.newspeed = 0;
    }else{
        newspeed=newspeed*t;
    }

}
public void show(){
    System.out.println("Дата "+data);
    System.out.println("Engine type "+enginetype);
    System.out.println("Максимальная скорость "+newspeed);
    System.out.println("Время до макс.скорости "+timetomax);
    System.out.println("Мест дял пасажиров "+passagires);
    System.out.println("Сейчас в машине "+passagiresnow);
    System.out.println("Скорость в данный момент"+speednow);
    System.out.println("Колес "+Wheels);
    System.out.println("Дверей "+doors);
}
}
