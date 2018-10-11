/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_2;

/**
 *
 * @author Do Tuan Bac
 */
public class Rectangle extends Shape {
    protected double width=1;
    protected double length=1;
    Rectangle()
    {
        
    }
        Rectangle(double width,double length)
    {
        this.width=width;
        this.length=length;
    }
            Rectangle(double width,double length,String color,boolean filled)
    {
        this.width=width;
        this.length=length;
         super.color=color;
           super.filled=filled;
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
    
     public double getArea()
    {
        return this.width*this.length;
    }
     
     public double getPerimeter()
    {
        return 2*(this.width+this.length);
    }
    
    @Override
    public String toString()
    {
        return "Rectangle( Chiều dài : " + this.length + ", Chiều rộng : "+this.width+" , Chu vi : "+this.getPerimeter()+" , Diện tích : "+this.getArea()+" )";
    }
}
