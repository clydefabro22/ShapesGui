package exercise.pkg1.shapes.gui;

public class Shape {
    protected String color;
    
    public Shape(String color){
        this.color = color;
    }
    
    @Override
    public String toString(){
        return this.color;
    }
}
