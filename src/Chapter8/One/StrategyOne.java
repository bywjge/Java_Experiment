package Chapter8.One;

public class StrategyOne implements Group{
    @Override
    public void group(int n) {
        System.out.printf("\n将1-%d按奇偶数分成两组:",n);
        System.out.print("\n偶数组:\n");
        for(int i=1;i<=n;i++){
            if(i%2==0)
                System.out.printf("%4d",i) ;
        }
        System.out.print("\n奇数组:\n");
        for(int i=1;i<=n;i++){
            if(i%2==1)
                System.out.printf("%4d",i) ;
        }
    }
}
