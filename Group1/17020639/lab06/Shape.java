
package Javaapllication4;

public class Shape{
    protected int x, y;
    protected boolean filled;
    protected String color;

    public Shape() {
    }

    public Shape(int x, int y, boolean filled, String color) {
        this.x = x;
        this.y = y;
        this.filled = filled;
        this.color = color;
    }  

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }    

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" + "x=" + x + ", y=" + y + ", filled=" + filled + ", color=" + color + '}';
    }

}
