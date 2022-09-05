
/**
 * @file Initial.java
 * @author Kaji Nasiruddin Ahmed
 * @brief create a class "Box" whose constructor is passed with 3 double values which represents length of the sides of the box. compute the volume the volume of the box using 1 method that displays the volume of the box.
 * @version 0.1
 * @date 2022-09-04
 * 
 * @copyright Copyright (c) 2022
 * 
 */
import java.util.*;

class BoxVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length: ");
        double length = sc.nextInt();
        System.out.print("enter width: ");
        double width = sc.nextInt();
        System.out.print("enter height: ");
        double height = sc.nextInt();
        sc.close();

        Box box = new Box(length, width, height);
        double vol = box.volume();

        System.out.println("Volume of Box is " + vol);

    }
}

class Box {
    public double length;
    public double height;
    public double width;

    Box(Double length, Double width, Double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double volume() {
        return this.height * this.width * this.length;
    }

}
