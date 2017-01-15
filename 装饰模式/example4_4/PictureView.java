package example4_4;

/**
 * Created by RYH on 2016/12/12.
 * 具体构件类    图片
 */
public class PictureView implements Component {
    public PictureView(){
        System.out.println("这是图片显示组件类");
    }
    public void display(){
        System.out.println("可以增加黑色边框");
    }
}
