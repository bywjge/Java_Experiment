package Chapter7.One;

public abstract class Window {
    double width;
    double height;
    public abstract String getMaterial();
    public void setWidth(double w) {
        width = w;
    }
    public void setHeight(double h) {
        height = h;
    }
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }

}
