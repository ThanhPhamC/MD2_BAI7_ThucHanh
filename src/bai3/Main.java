package bai3;

import java.util.Comparator;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle[] circles=new Circle[3];
        circles[0]=new Circle("Red",true,3);
        circles[1]=new Circle("Green",false,2);
        circles[2]=new Circle("Blue",true,1);
        System.out.println("truoc sap xep");
        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i]);
        }
        Arrays.sort(circles, new Comparator<Circle>() {
            @Override
            public int compare(Circle o1, Circle o2) {
                if (o1.getRadius()>o2.getRadius()){
                    return 1;
                } else if (o1.getRadius()<o2.getRadius()) {
                    return -1;
                }else
                return 0;
            }
        });
        System.out.println("sau sap xep");
        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i]);

        }
        System.out.println("--------sap xep theo mau tang------------");
        Arrays.sort(circles, new Comparator<Circle>() {
            @Override
            public int compare(Circle o1, Circle o2) {

                return o1.getColor().compareTo(o2.getColor());
            }
        });


    }
}
