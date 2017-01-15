package example4_3;
//ÈÝÆ÷¹¹¼þÀà   
import java.util.ArrayList;

public class Office extends MyElement {

	private ArrayList<MyElement> list=new ArrayList<MyElement>();
	
	public void add(MyElement element){
		list.add(element);
	}
	public void remove(MyElement element){
		list.remove(element);
	}
	public void send() {
		for(Object object:list){
			((MyElement)object).send();
		}
	}

}
