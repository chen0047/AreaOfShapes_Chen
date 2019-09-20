package lab5a;

public class Rectangle {
    private double length;
    private double height;
    
    public Rectangle(){
        this.length = 1;
        this.height = 1;
        
    }
    
    public Rectangle(double newLength, double newHeight){
        this.setLength(1);
        this.setLength(newLength);
        this.setHeight(1);
        this.setHeight(newHeight);
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public void setLength(double length) {
        if (length>=0.1)
            this.length = length;
    }

    public void setHeight(double height) {
        if (height>=0.1)
            this.height = height;
    }

    public double area(){
        return (this.length * this.height);
    }
    
    @Override
    public String toString(){
     
     return("[" + area() + "]");   
    }
}
