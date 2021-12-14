package com.company;

public class Try {

        static int count;
        private String flavor = "sweet";
        Try(String s) { flavor = s; }
        void setFlavor(String s) { flavor = s; }
        String getFlavor() { return flavor; }
        static public void main(String[] args) {
            Try pepper = new Try("spicy");
            Try chile = pepper;
            pepper.setFlavor("smoky");
            System.out.println(pepper == chile);
        }

}


