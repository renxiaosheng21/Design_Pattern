package example4_4;

/**
 * Created by RYH on 2016/12/12.
 * ����װ��
 */
public class Decorator implements Component{
    private Component component;
    public Decorator(Component component){
        this.component=component;
    }
    public void display(){
        component.display();
    }
}
