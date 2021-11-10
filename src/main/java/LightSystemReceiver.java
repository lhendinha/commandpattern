public class LightSystemReceiver implements Electronics {

    @Override
    public void on() {
        System.out.println("Light System is on");

    }

    @Override
    public void off() {
        System.out.println("Light System is off");
    }
}