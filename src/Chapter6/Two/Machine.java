package Chapter6.Two;

public class Machine {
    public void checkBag(Goods goods) throws DangerException {
        if (goods.isDanger()) throw new DangerException();
    }
}
