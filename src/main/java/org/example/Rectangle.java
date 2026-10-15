package org.example;

public class Rectangle {
    int width;
    int height;

    Rectangle(int _width, int _height){

        width = _width;
        height = _height;
    }

    void areaCalc(){

        double area = width * height;
        System.out.println("The area is " + area);
    }
    void perimeterCalc(){

        double perimeter = 2 * ( width * height);
        System.out.println("The perimeter is " + perimeter);
    }
}
