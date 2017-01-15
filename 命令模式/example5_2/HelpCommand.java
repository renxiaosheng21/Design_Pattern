package example5_2;

/**
 * Created by RYH on 2016/12/12.
 */
public class HelpCommand extends Command{
    private DisplayHelpClass hcObj;

    public HelpCommand(){
        hcObj=new DisplayHelpClass();
    }

    public void execute(){
        hcObj.display();
    }
}
