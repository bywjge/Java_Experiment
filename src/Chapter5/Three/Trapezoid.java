package Chapter5.Three;

public class Trapezoid extends Geometry{

    double a,b,h;

    public Trapezoid(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double getArea() {
        return (a + b)*h/2;
    }
}
