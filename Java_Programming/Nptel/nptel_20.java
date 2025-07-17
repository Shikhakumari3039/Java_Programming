interface ShapeX {
    String base = "This is Shape1"; // implicitly public static final
    void display1();                // implicitly public and abstract
}

interface ShapeY extends ShapeX {
    String base = "This is Shape2"; // hides ShapeX.base
    void display2();
}

class ShapeG implements ShapeY {
    String base = "This is Shape3"; // this hides interface fields, not overrides

    public void display1() {
        System.out.println("Circle: " + ShapeX.base);
    }

    public void display2() {
        System.out.println("Circle: " + ShapeY.base);
    }
}

public class nptel_20 {
    public static void main(String[] args) {
        ShapeG circle = new ShapeG();
        circle.display1(); // Outputs: Circle: This is Shape1
        circle.display2(); // Outputs: Circle: This is Shape2
    }
}
