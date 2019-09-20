package lab5a;
 
public final class Circle {
    private double radius;
    
    public Circle(){
    
        this.radius = 1.0;
    }
    
    public Circle(double newRadius){
        this.setRadius(1.0);
        this.setRadius(newRadius);
    }

    public void setRadius(double radius) {
        if (radius>=0)
             this.radius = radius;
    }
    

    public double getRadius() {
        return radius;
    }
    
    public double area(){
        return (Math.PI * Math.pow(this.radius, 2));
        
    }
    
    
    public String toString(){
        return("(" + area() +")");
        
    }
}
