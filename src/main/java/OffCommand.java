import java.util.List;

public class OffCommand implements Command {

    List<Electronics> elecList;

    public OffCommand (List<Electronics> elcList){
        this.elecList = elcList;
    }

    @Override
    public void execute() {
        for (Electronics homeElec : elecList) {
            homeElec.off();
        }
    }
}