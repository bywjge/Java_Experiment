package Chapter5.Five.Water;

public class Water {
    WaterState waterState;

    public void getWaterState() {
        waterState.showState();
    }

    public void setWaterState(WaterState waterState) {
        this.waterState = waterState;
    }
}
