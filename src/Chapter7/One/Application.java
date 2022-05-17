package Chapter7.One;

public class Application {
    public static void main(String[] args){
        int m=7;
        Building schoolBuilding = new Building(m);
        Window [] w = new Window[m];
        for(int i=0;i<m;i++) {
            if(i%3==0) {
                w[i] = new WoodWindow();
                w[i].setWidth(109.98);
                w[i].setHeight(156.89);
            }
            else if(i%3==1){
                w[i] = new AluminumWindow();
                w[i].setWidth(109.99);
                w[i].setHeight(156.87);
            }
            else {
                w[i] = new IronWindow();
                w[i].setWidth(109.98);
                w[i].setHeight(156.89);
            }
        }
        schoolBuilding.use(w);
        schoolBuilding.showWindow();
    }
}
