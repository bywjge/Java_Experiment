package Chapter5.Three;

public class TotalArea {
    Geometry[] tuxing;
    double totalArea=0;
    public void setTuxing(Geometry[] t) {
        tuxing=t;
    }
    public double computerTotalArea() {
        for (Geometry geometry : tuxing) {
            totalArea = totalArea + geometry.getArea();//用循环语句让tuxing的元素调用getArea方法，并将返回的值累加到totalArea
        }
        return totalArea;
    }

}
