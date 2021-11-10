public class HeaterReceiver implements Electronics {

    @Override
    public void on() {
        System.out.println("Heater is on");

    }

    @Override
    public void off() {
        System.out.println("Heater is off");
    }
}