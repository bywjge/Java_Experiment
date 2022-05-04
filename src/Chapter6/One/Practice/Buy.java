package Chapter6.One.Practice;


public class Buy {
    public static void main(String[] args) {
        MobileShop shop=new MobileShop();
        shop.setMobileAmount(30);
        System.out.println("手机专卖店目前有"+shop.getMobileAmount()+"部手机");
        shop.purchase1.buyMobile();
        shop.purchase2.buyMobile();
        System.out.println("手机专卖店目前有"+shop.getMobileAmount()+"部手机");

    }
}

class MobileShop{


    InnerPurchaseMoney purchase1;
    InnerPurchaseMoney purchase2;

    private int mobileAmount;

    MobileShop(){
        purchase1=new InnerPurchaseMoney(20000);
        purchase2=new InnerPurchaseMoney(10000);

    }
    void setMobileAmount(int m){
        mobileAmount=m;
    }
    int getMobileAmount(){
        return mobileAmount;
    }
    class InnerPurchaseMoney{
        int moneyValue;
        InnerPurchaseMoney(int m){
            moneyValue=m;
        }
        void buyMobile(){

            if(moneyValue>=20000){
                mobileAmount=mobileAmount-6;
                System.out.println("用价值"+moneyValue+"的内部购物卷买了6部手机");
            }
            else if(moneyValue>=10000){
                mobileAmount=mobileAmount-3;
                System.out.println("用价值"+moneyValue+"的内部购物卷买了3部手机");
            }
        }
    }
}
