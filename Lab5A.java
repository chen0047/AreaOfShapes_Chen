package lab5a;
/*
Chen Chen
CS232-01
9/29/18
*/
public class Lab5A {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(3);
        
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5,4);
        
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(3, 6);
        
        double total = 0;
        
        System.out.println("Areas of each Circle:");
        System.out.println(c1);
        total = total+c1.area();
        System.out.println(c2);;
        total = total+c2.area();
        
        System.out.println("Total Circle Area = " + total);
        
        
        total = 0;
        
        System.out.println("Areas of each Rectangle:");
        System.out.println(r1);
        total = total+r1.area();
        System.out.println(r2);;
        total = total+r2.area(); 
        
        System.out.println("Total Rectangle Area = " + total);
        
        total = 0;
        
        System.out.println("Areas of each Triangle:");
        System.out.println(t1);
        total = total+t1.area();
        System.out.println(t2);;
        total = total+t2.area();  
        
        System.out.println("Total Triangle Area = " + total);
    }
    
}
