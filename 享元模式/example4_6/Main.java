package example4_6;
//��Ԫģʽ
public class Main {

	public static void main(String[] args) {
		SharedString str1,str2;
		SharedStringFactory factory=new SharedStringFactory();
		str1=factory.getSharedString("Java");
		str1.setColor(new Color("��ɫ"));
		str1.setSize(new Size(10));
		str1.display();//�������

		str2=factory.getSharedString("Java");
		str2.setColor(new Color("��ɫ"));
		str2.setSize(new Size(5));
		str2.display();//�������
		System.out.println(str1==str2);
	}

}
