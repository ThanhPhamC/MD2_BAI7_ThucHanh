package bai2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle();
        circles[1] = new ComparableCircle(3.2);
        circles[2] = new ComparableCircle("red", true, 4);
        System.out.println("sap xep tang dan:");
        Arrays.sort(circles);
        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i]);
        }
    }
}
