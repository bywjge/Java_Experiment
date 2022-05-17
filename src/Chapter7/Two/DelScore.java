package Chapter7.Two;

public class DelScore {
    ComputerAver computer ;
    DelScore(ComputerAver computer) {
        this.computer = computer;
    }
    public void doDelete(double [] a) {
        java.util.Arrays.sort(a);  //数组a从小到大排序
        System.out.print("去掉一个最高分:"+a[a.length-1]+"，");
        System.out.print("去掉一个最低分:"+a[0]+"。");
        double[] b =new double[a.length-2];
        //去掉最高分和最低分
        System.arraycopy(a, 1, b, 0, a.length - 1 - 1);
        computer.giveAver(b);
    }


}
