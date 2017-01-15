package example4_6;
//享元模式
public class Main {

	public static void main(String[] args) {
		SharedString str1,str2;
		SharedStringFactory factory=new SharedStringFactory();
		str1=factory.getSharedString("Java");
		str1.setColor(new Color("红色"));
		str1.setSize(new Size(10));
		str1.display();//输出内容

		str2=factory.getSharedString("Java");
		str2.setColor(new Color("黑色"));
		str2.setSize(new Size(5));
		str2.display();//输出内容
		System.out.println(str1==str2);
	}

}
