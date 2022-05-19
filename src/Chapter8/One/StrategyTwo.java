package Chapter8.One;

public class StrategyTwo implements Group{
    @Override
    public void group(int n) {
        System.out.printf("\n将1-%d用3求余分成三组:",n);
        System.out.print("\n被3除尽的组:\n");
        for(int i=1;i<=n;i++){
            if(i%3==0)
                System.out.printf("%4d",i) ;
        }
        System.out.print("\n被3除余1的组:\n");
        for(int i=1;i<=n;i++){
            if(i%3==1)
                System.out.printf("%4d",i) ;
        }
        System.out.print("\n被3除余2的组:\n");
        for(int i=1;i<=n;i++){
            if(i%3==2)
                System.out.printf("%4d",i) ;
        }

    }
}
