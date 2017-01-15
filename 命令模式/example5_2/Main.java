package example5_2;

/**
 * Created by RYH on 2016/12/12.
 * ÃüÁîÄ£Ê½
 */
public class Main {
    public static void main(String[] args){
        Command command1,command2;

        command1=new HelpCommand();
        command2=new ExitCommand();

        FunctionButton functionButton1=new FunctionButton(command1);
        functionButton1.click();

        System.out.println("- - - - - - - - - -");
        FunctionButton functionButton2=new FunctionButton(command2);
        functionButton2.click();

    }
}
