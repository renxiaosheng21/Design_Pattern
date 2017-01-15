package example4_4;

/**
 * Created by RYH on 2016/12/12.
 * в╟йндёй╫
 */
public class Main {
    public static void main(String [] args){
        Component component;
        component=new TextView();
        component.display();

        ScrollBarDecorator sc=new ScrollBarDecorator(component);
        sc.display();
        System.out.println("-------------");

        component=new PictureView();
        component.display();

        BlackBorderDecorator blackBorderDecorator = new BlackBorderDecorator(component);
        blackBorderDecorator.display();
        System.out.println("------------");
    }
}
