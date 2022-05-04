package Chapter6.Two;

public class Check {
    public static void main(String[] args) {
        Machine machine = new Machine();
        String[] name ={"苹果","炸药","西服","硫酸","手表","硫磺"};
        Goods [] goods = new Goods[name.length]; //检查6件物品
        for(int i= 0;i<name.length;i++) {
            goods[i] = new Goods();
            if(i%2==0) {
                goods[i].setIsDanger(false);
                goods[i].setName(name[i]);
            }
            else {
                goods[i].setIsDanger(true);
                goods[i].setName(name[i]);
            }
        }
        for (Goods good : goods) {
            try {
                machine.checkBag(good);
                System.out.println(good.getName() + "检查通过");
            } catch (DangerException e) {
                e.toShow(); //e调用toShow()方法
                System.out.println(good.getName() + "被禁止!");
            }
        }
    }
}
