package example4_4;

/**
 * Created by RYH on 2016/12/12.
 * ����װ����
 */
public class ScrollBarDecorator extends Decorator {
    public ScrollBarDecorator (Component component){
        super(component);
    }
    public void display(){
        System.out.println("���ӹ�����");
    }
}
