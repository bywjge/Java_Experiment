package Chapter5.Five;

public class CloudyDayState implements WeatherState{
    @Override
    public void showState() {
        System.out.print("多云,有时阴");
    }
}
