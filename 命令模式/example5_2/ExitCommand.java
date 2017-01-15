package example5_2;

/**
 * Created by RYH on 2016/12/12.
 */
public class ExitCommand extends Command {
    private SystemExitClass seObj;
    public  ExitCommand(){
        seObj=new SystemExitClass();
    }
    public void execute(){
        seObj.exit();
    }
}
