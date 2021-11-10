import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CommandTest {

    @Test
    void testLightSystem() {
        System.out.println("Running: testLightSystem");

        Electronics elc = UniversalRemote.getActiveDevice();
        OnCommand onCommand = new OnCommand(elc);
        ButtonInvoker onButton = new ButtonInvoker(onCommand);

        onButton.click();
    }

    @Test
    void testAllOff() {
        System.out.println("Running: testAllOff");

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