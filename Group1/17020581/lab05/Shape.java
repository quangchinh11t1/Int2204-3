package lab05;

public class Shape {
    String color;
    boolean filled;

    public Shape() {
        this.color="red";
        this.filled=true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }
    public boolean isFilled()
    {
        return filled;
    }
    @Override
    public String toString()
    {
        return getColor() + "\t" + isFilled();
    }
}