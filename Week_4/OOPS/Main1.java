package Week_4.OOPS;

 class Box {
    
 protected double length;
    protected double breadth;

    // Constructor
    public Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Area of rectangle
    public double area() {
        return length * breadth;
    }

    public void displayArea() {
        System.out.println("Area = " + area());
    }
}

// Derived Class
class Box3D extends Box {

    private double height;

    // Constructor
    public Box3D(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    // Volume of box
    public double volume() {
        return length * breadth * height;
    }

    public void displayVolume() {
        System.out.println("Volume = " + volume());
    }
}

// Main Class
public class Main1 {
    public static void main(String[] args) {

        Box box = new Box(10, 5);
        box.displayArea();

        Box3D box3d = new Box3D(10, 5, 4);
        box3d.displayArea();
        box3d.displayVolume();
    }
}