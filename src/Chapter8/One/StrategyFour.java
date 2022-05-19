package Chapter8.One;

public class StrategyFour implements Group{
    // 素数和非素数分组
    public boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i < n; ++i)

            if(n%i == 0) return false;
        return true;
    }

    @Override
    public void group(int n) {
        int[] prime = new int[n+1];
        int left=0, right=n;
        System.out.printf("\n将1-%d按是否为素数分成两组:",n);
        for (int i=1; i<=n; i++){
            if(isPrime(i)) prime[left++]=i;
            else prime[right--] = i;
        }
        System.out.println("\n素数的组：");
        for (int i=0; i<left; i++){
            System.out.printf("%3d",prime[i]) ;
        }
        System.out.println("\n非素数的组：");
        for (int i=n; i>right; i--){
            System.out.printf("%3d",prime[i]) ;
        }
    }
}
