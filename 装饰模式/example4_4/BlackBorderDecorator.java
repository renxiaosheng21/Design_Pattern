package example4_4;

/**
 * Created by RYH on 2016/12/12.
 * ����װ����   �����Ӻ�ɫ�߿�
 */
public class BlackBorderDecorator extends Decorator {
    public BlackBorderDecorator(Component component){
        super(component);
    }

    @Override
    public void display() {
        System.out.println("���Ӻ�ɫ�߿�");
    }
}
