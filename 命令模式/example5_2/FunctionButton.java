package example5_2;

/**
 * Created by RYH on 2016/12/12.
 */
public class FunctionButton {
    private Command commond;

    public FunctionButton(Command command){
        this.commond = command;
    }

//    public void setCommon(Command common) {
//        this.common = common;
//    }
    public void click(){
        commond.execute();
    }
}
