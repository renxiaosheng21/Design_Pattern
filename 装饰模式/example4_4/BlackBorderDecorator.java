package example4_4;

/**
 * Created by RYH on 2016/12/12.
 * 具体装饰类   （增加黑色边框）
 */
public class BlackBorderDecorator extends Decorator {
    public BlackBorderDecorator(Component component){
        super(component);
    }

    @Override
    public void display() {
        System.out.println("增加黑色边框");
    }
}
