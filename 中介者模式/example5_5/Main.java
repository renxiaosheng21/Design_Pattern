package example5_5;
//�н���ģʽ
public class Main {

	public static void main(String[] args) {
		WTO wto=new WTO();
		China cn=new China();
		America us=new America();
		
		cn.setUn(wto);
		us.setUn(wto);
		
		wto.setCn(cn);
		wto.setUs(us);
		
		cn.declare("�й���һ�����ú�ƽ�Ĺ��ҡ�");
		us.declare("��������Ϊ�����ƽ��Ŭ����");
		
	}

}
