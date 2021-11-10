import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Electronics elc = UniversalRemote.getActiveDevice();
        OnCommand onCommand = new OnCommand(elc);
        ButtonInvoker onButton = new ButtonInvoker(onCommand);

        onButton.click();

        LightSystemReceiver ls = new LightSystemReceiver();
        AirConditionerReceiver ac = new AirConditionerReceiver();
        List<Electronics> allElc = new ArrayList<Electronics>();

        allElc.add(ls);
        allElc.add(ac);

        OffCommand offAll = new OffCommand(allElc);
        ButtonInvoker offAllButton = new ButtonInvoker(offAll);

        offAllButton.click();
    }
}