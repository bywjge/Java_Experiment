package Chapter5.Three;

public class Circle extends Geometry{
    double r;
    Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return (3.14 * r * r);
    }
    //重写 getArea()方法

}
