package lab5a;

public class Triangle {
    private double base;
    private double height;
    
    public Triangle(){
        this.base= 1;
        this.height=1;
        
    }
    
    public Triangle(double newBase, double newHeight){
        this.setBase(1);
        this.setBase(newBase);
        this.setHeight(1);
        this.setHeight(newHeight);
    }
    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        if(base>=0)
            this.base = base;
    }

    public void setHeight(double height) {
        if (height>=0)
            this.height = height;
    }
    
    public double area(){
        return (0.5 * this.base * this.height);
    }
    
    public String toString(){
        return ("/" + area() + "\\");
    }
}
