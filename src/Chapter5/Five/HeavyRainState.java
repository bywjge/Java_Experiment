package Chapter5.Five;

public class HeavyRainState implements WeatherState{
    @Override
    public void showState() {
        System.out.print("大雨.");
    }
}
