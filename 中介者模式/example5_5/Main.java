package example5_5;
//中介者模式
public class Main {

	public static void main(String[] args) {
		WTO wto=new WTO();
		China cn=new China();
		America us=new America();
		
		cn.setUn(wto);
		us.setUn(wto);
		
		wto.setCn(cn);
		wto.setUs(us);
		
		cn.declare("中国是一个爱好和平的国家。");
		us.declare("美国将会为世界和平而努力。");
		
	}

}
