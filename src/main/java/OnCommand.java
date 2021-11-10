public class OnCommand implements Command {

    private Electronics electronics;

    public OnCommand (Electronics elc){
        this.electronics = elc;
    }

    @Override
    public void execute() {
        electronics.on();
    }
}