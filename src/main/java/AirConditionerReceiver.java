public class AirConditionerReceiver implements Electronics {

    @Override
    public void on() {
        System.out.println("Air Conditioner is on");
    }

    @Override
    public void off() {
        System.out.println("Air Conditioner is off");
    }
}