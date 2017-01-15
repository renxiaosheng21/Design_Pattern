package example5_7;
//观察者模式
public class Main {

	public static void main(String[] args) {
		MySubject subject=new Army();
		
		MyObserver obs1,obs2,obs3;
		
		obs1=new Player1();
		obs2=new Player1();
		obs3=new Player2();
		
		subject.join(obs1);
		subject.join(obs2);
		subject.join(obs3);
		subject.attach();
	}

}
