package Chapter8.One;

public class StrategyThree implements Group{
    @Override
    public void group(int n) {
        System.out.printf("\n将1-%d按个位是否是3,4,5,7分成两组:",n);
        System.out.print("\n个位是3,4,5或7的组:\n");
        for(int i=1;i<=n;i++){
            if(i%10==3||i%10==4||i%10==5||i%10==7)
                System.out.printf("%3d",i) ;
        }
        System.out.print("\n个位不是3,4,5,7的组:\n");
        for(int i=1;i<=n;i++){
            if(!(i%10==3||i%10==4||i%10==5||i%10==7))
                System.out.printf("%3d",i) ;
        }

    }
}
