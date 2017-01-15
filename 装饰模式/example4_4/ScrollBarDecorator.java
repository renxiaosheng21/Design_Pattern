package example4_4;

/**
 * Created by RYH on 2016/12/12.
 * 具体装饰类
 */
public class ScrollBarDecorator extends Decorator {
    public ScrollBarDecorator (Component component){
        super(component);
    }
    public void display(){
        System.out.println("增加滚动条");
    }
}
