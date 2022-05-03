package Chapter5.Five.Water;

public class Main {
    public static void main(String[] args) {
        Water water = new Water();
        water.setWaterState(new HotWater());
        water.getWaterState();
        water.setWaterState(new WarmBoiledWater());
        water.getWaterState();
    }
}
