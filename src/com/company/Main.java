package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,6,3);
        rectangle.printRectangle();

        RoundedRectangle roundedRectangle = new RoundedRectangle(8,4,6, 5);
        roundedRectangle.printRoundedRectangle();
    }
}
