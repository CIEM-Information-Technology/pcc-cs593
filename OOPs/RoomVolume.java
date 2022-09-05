
/**
 * @file Initial.java
 * @author Kaji Nasiruddin Ahmed
 * @brief create a class "Room" which will hold height, width and length as 3 variable. create another class "DemoRoom" which will use earlier class and create an instance of "DemoRoom". set the values of the variables and calculate the colume of the room.
 * @version 0.1
 * @date 2022-09-04
 * 
 * @copyright Copyright (c) 2022
 * 
 */
import java.util.*;

class RoomVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length: ");
        int length = sc.nextInt();
        System.out.print("enter width: ");
        int width = sc.nextInt();
        System.out.print("enter height: ");
        int height = sc.nextInt();
        sc.close();

        Room myroom = new DemoRoom();
        myroom.length = length;
        myroom.width = width;
        myroom.height = height;
        int vol = myroom.volume();

        System.out.println("Volume of myroom is " + vol);

    }
}

class Room {
    public int length;
    public int height;
    public int width;

    public int volume() {
        return this.height * this.width * this.length;
    }

}

class DemoRoom extends Room {
}
