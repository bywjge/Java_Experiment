package Chapter7.Two;

public class ComputerAver {

    CheckQualified checkQualified;
    ComputerAver(CheckQualified checkQualified){
        this.checkQualified = checkQualified;
    }
    public void giveAver(double [] b) {
        double sum=0;
        for (double v : b) {
            sum = sum + v;
        }
        double aver=sum/b.length;
        System.out.println("选手最后得分"+aver);
        checkQualified.check(aver);
    }

}
