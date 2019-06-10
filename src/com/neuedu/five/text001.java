package com.neuedu.five;

public class text001 {
    public static void main(String[] args) {
        AAA(new car(), "陆地行使", 20, 90.0);
        AAA(new plan(), "空中行使", 60, 1000.0);
        AAA(new ship(), "水上行使", 40, 300.0);
        SSS();
    }

    public static void AAA(jiaotonggongju Q, String a, int b, double c) {
        Q.HMseat(b);
        Q.HMspeed(c);
        Q.Howwork(a);
    }
    public static void SSS(){
        OpenWindow C=new car();
        C.open();
        OpenWindow D=new ship();
        D.open();
    }
}
