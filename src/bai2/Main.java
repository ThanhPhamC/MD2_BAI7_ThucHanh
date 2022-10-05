package bai2;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle();
        circles[1] = new ComparableCircle(3.2);
        circles[2] = new ComparableCircle("red", true, 4);
        System.out.println("sap xep tang dan:");
        for (ComparableCircle x :
                circles) {
            System.out.println(x);
        }
    }
}
