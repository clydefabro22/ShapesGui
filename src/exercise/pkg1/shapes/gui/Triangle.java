package exercise.pkg1.shapes.gui;

public class Triangle extends Shape{
    protected double base;
    protected double height;
    
    public Triangle(String color, double base, double height){
        super(color);
        this.base = base;
        this.height = height;
    }
    
    @Override
    public String toString(){
        return String.valueOf(base) + " " + String.valueOf(height) + " " + color;
    }
    
    public double getArea(){
        return 0.5 * base * height;
    }
}
