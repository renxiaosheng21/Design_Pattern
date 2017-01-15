package example5_7;
//抽象目标类
import java.util.ArrayList;

public abstract class MySubject {
	protected ArrayList<MyObserver> observers=new ArrayList<MyObserver>();
	
	public void join(MyObserver observer){
		observers.add(observer);
	}
	
	public void quit(MyObserver observer){
		observers.remove(observer);
	}
	
	public abstract void attach();
}
