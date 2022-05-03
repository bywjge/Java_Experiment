package Chapter5.Four;

import java.util.Arrays;

public class School implements ComputerAverage{
    @Override
    public double average(double[] x) {
        int count = x.length;
        double aver = Arrays.stream(x).sum();
        aver /= count;
        return aver;
    }
}
