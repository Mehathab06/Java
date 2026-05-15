package Composition;

public class Mobile {
    Battery battery = new Battery();
    void powerOn(){
        battery.batteryStatus();
        System.out.println("Mobile is On");
    }
}
