package exercise.pkg1.shapes.gui;

public class Rectangle extends Shape {
    protected int length;
    protected int width;
    
    public Rectangle(String color, int length, int width){
        super(color);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public String toString(){
        return String.valueOf(length) + " " + String.valueOf(width) + " " + color;
    }
    
    public int getArea(){
        return length*width;
    }
}
