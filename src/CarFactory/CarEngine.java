package CarFactory;

public class CarEngine {
    String data = "1990.05.20";
    String enginetype;
    double newspeed;
    int timetomax;
    int passagires;
    int passagiresnow;
    double speednow;
    int four=4;
    double[] Wheels = new double[four];
    String[] doors = new String[four];
    int q;
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
        passagiresnow=0;
    }
    public void indexdoor (int d){
        this.q=d;
        for (int i = 0; i < 4; i++){
            doors[i] = "Closed";
            if(i==d) {System.out.println("Дверь " + i +"-"+ doors[i]);}
        }
    }
    public void indexwheel (int p,double s){
        double y=s;
        for (int i = 0; i < 4; i++){
            Wheels[i] = s;
            if(i==p) {System.out.println("Колесо " + i +"-"+ Wheels[i]);}
        }
    }
    public void deletewheels (){
       four=0;
    }
    public void newwheels(int k){
        four=four+k;
}
public void maxspeednew(double s){
    double t=s;
    if(this.passagiresnow==0){
        newspeed = 0;
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
    System.out.println("Скорость в данный момент "+newspeed);
}
}
