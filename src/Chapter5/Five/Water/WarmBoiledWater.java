package Chapter5.Five.Water;

public class WarmBoiledWater implements WaterState{
    @Override
    public void showState() {
        System.out.println("温开水");
    }
}
