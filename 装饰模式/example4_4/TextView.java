package example4_4;


/**
 * Created by RYH on 2016/12/12.
 * 具体构件类  文本
 */
public class TextView implements Component {
    public TextView(){
        System.out.println("这是个文本组件类");
    }
    public void display(){
        System.out.println("可以用来增加滚动条");
    }
}
