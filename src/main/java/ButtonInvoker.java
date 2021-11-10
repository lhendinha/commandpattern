public class ButtonInvoker {

    Command c;

    public ButtonInvoker(Command c) {
        this.c = c;
    }

    public void click(){
        c.execute();
    }
}