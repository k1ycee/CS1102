package com.company;

class Try {
//    Try() { System.out.println(flavor); }
String flavor = "bland";
}
class Pepper extends Try {
    String flavor = "spicy";

    public static void main(String[] args) {
        Try lunch = new Pepper();
        System.out.println(lunch.flavor);
    }
}
//public class Lunch {
//    public static void main(String[] args) {
//         lunch = new Pepper();
//    }
//}


