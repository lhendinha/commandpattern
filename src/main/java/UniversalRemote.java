public class UniversalRemote {
    public static Electronics getActiveDevice() {
        LightSystemReceiver ls = new LightSystemReceiver();
        return ls;
    }
}