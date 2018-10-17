/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author thang
 */
public class Rectangle extends Shape{                                           
    double width = 1.0;
    double length = 1.0;

    public Rectangle() {
    }
    public Rectangle (double width, double length){
        this.width= width;
        this.length= length;
    }

    public Rectangle(String color, boolean filled,double width, double length) {
        super(color, filled);
        this.width= width;
        this.length= length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea (){
        return width*length;
    }
    public double getPermeter (){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }
    

}
