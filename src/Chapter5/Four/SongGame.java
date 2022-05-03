package Chapter5.Four;

public class SongGame implements ComputerAverage{
    @Override
    public double average(double[] x) {
        int count=x.length;
        double aver=0,temp;
        for(int i=0;i<count;i++) {
            for(int j=i;j<count;j++) {
                if(x[j]<x[i]) {
                    temp=x[j];
                    x[j]=x[i];
                    x[i]=temp;
                }
            }
        }
        for(int i=1;i<count-1;i++) {
            aver=aver+x[i];
        }
        if(count>2)
            aver=aver/(count-2);
        else
            aver=0;
        return aver;
    }
}
