/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import static java.lang.Math.sqrt;
import java.util.Vector;

/**
 *
 * @author Genius
 */
class Toado{
    private double x, y;

    public Toado() {
    }

    public Toado(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
}
class Shape{
    protected String color;
    protected boolean filled;
    protected Toado tam;
    public Shape(){
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled, Toado tam) {
        this.color = color;
        this.filled = filled;
        this.tam = tam;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Toado getTam() {
        return tam;
    }

    public void setTam(Toado tam) {
        this.tam = tam;
    }
    public void dichuyen(double dodai, String huong){
        switch (huong) {
            case "bac":
                tam.setY(tam.getY() + dodai);
                break;
            case "nam":
                tam.setY(tam.getY() - dodai);
                break;
            case "dong":
                tam.setX(tam.getX() + dodai);
                break;
            case "tay":
                tam.setX(tam.getX() - dodai);
                break;
            default:
                break;
        }
    }
    public void info(){
        System.out.println("");
    }
}
@SuppressWarnings("serial")
class Layer extends Vector <Shape>{

    public Layer(int initialCapacity) {
        super(initialCapacity);
    }

    public Layer() {
        super(0);
    }
    public void eraseTriangle(){
        for(int j = 0;j < this.size();j ++)
            if(this.elementAt(j) instanceof Triangle){
                this.remove(j);
                j --;
            }
    }
}
@SuppressWarnings("serial")
class Diagram extends Vector<Layer>{

    public Diagram() {
        super(0);
    }

    public Diagram(int initialCapacity) {
        super(initialCapacity);
    }
    public void eraseCricle(){
        for(int j = 0;j < this.size();j ++){
            for(int k = 0;k < this.elementAt(j).size();k ++)
                if(this.elementAt(j).elementAt(k) instanceof Cricle){
                    this.elementAt(j).remove(k);
                    k --;
                }
        }
    }
}
@SuppressWarnings("serial")
class Cricle extends Shape{
    protected double radius;
    final double pi = 3.14;

    public Cricle() {
    }

    public Cricle(double radius) {
        this.radius = radius;
    }

    public Cricle(double radius, String color, boolean filled, Toado tam) {
        super(color, filled, tam);
        this.radius = radius;
    }
    

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return radius*radius*pi;
    }
    public double getPerimeter(){
        return 2*radius*pi;
    }
    @Override
    public void info(){
        System.out.println("Day la hinh tron: (ban kinh) " + radius);
    }
}

class Rectangle extends Shape{
    protected double width, length;
    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled, Toado tam) {
        super(color, filled, tam);
        this.width = width;
        this.length = length;
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
    
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (width + length)*2;
    }
    @Override
    public void info(){
        System.out.println("Day la hinh chu nhat: (chieu dai, chieu rong) " + length + " " + width);
    }
}
class Triangle extends Shape{
    protected double c1, c2, c3;
    protected Toado[] tg = new Toado[3];

    public Triangle() {
    }

    public Triangle(double c1, double c2, double c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    public Triangle(double c1, double c2, double c3, String color, boolean filled, Toado tam) {
        super(color, filled, tam);
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }
    
    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }

    public double getC2() {
        return c2;
    }

    public void setC2(double c2) {
        this.c2 = c2;
    }

    public double getC3() {
        return c3;
    }

    public void setC3(double c3) {
        this.c3 = c3;
    }
    public double getArea(){
        double p = (c1 + c2 + c3)/2;
        return sqrt(p*(p - c1)*(p - c2)*(p - c3));
    }
    public double getPerimeter(){
        return (c1 + c2 + c3);
    }
    @Override
    public void info(){
        System.out.println("Day la hinh tam giac: (do dai 3 canh) " + c1 + " " + c2 + " " + c3);
    }
}
@SuppressWarnings("serial")
class Square extends Rectangle{
    protected double side;
    public Square(){
        
    }
    public Square(double side){
        super(side, side);
        this.side = side;
    }    

    public Square(double side, String color, boolean filled, Toado tam) {
        super(side, side, color, filled, tam);
        this.side = side;
    }
    
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        this.width = side;
        this.length = side;
    }
    @Override
    public void setWidth(double width) {
        this.width = width;
        this.side = width;
        this.length = width;
    }
    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
        this.side = length;
    }
    @Override
    public void info(){
        System.out.println("Day la hinh vuong: (do dai canh) " + side);
    }
}     
public class Lab06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Diagram t = new Diagram();
        //test thu eraseTriangle
        Layer t1 = new Layer();
        t1.add(new Triangle(3, 4, 5));
        t1.add(new Cricle(3));
        t1.add(new Rectangle(4, 5));
        t1.add(new Square(5));
        for(int j = 0;j < t1.size();j ++)
            t1.elementAt(j).info();
        t1.eraseTriangle();
        System.out.println("\nSau khi xoa hinh tam giac: \n");
        for(int j = 0;j < t1.size();j ++)
            t1.elementAt(j).info();
        //test thu eraseCricle
        t.add(t1);
        Layer t2 = new Layer();
        t2.add(new Cricle(3));
        t2.add(new Cricle(2));
        t2.add(new Triangle(3, 5, 2.5));
        t.add(t2);
        System.out.println("\nTruoc khi xoa hinh tron:\n");
        for(int j = 0;j < t.size();j ++){
            for(int k = 0;k < t.elementAt(j).size();k ++)
                t.elementAt(j).elementAt(k).info();
            System.out.println("");
        }
        t.eraseCricle();
        System.out.println("\nSau khi xoa hinh tron:\n");
        for(int j = 0;j < t.size();j ++){
            for(int k = 0;k < t.elementAt(j).size();k ++)
                t.elementAt(j).elementAt(k).info();
            System.out.println("");
        }
    }
    
}