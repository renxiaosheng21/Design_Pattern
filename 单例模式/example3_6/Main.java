package example3_6;
//����ģʽ
public class Main {
	public static void main(String a[]){
		SnoCard no1,no2;
		no1=SnoCard.getInstance();
		no2=SnoCard.getInstance();
		System.out.println("ѧ��ѧ���Ƿ�һ�£�"+(no1==no2));
		
		String str1,str2;
		str1=no1.getNo();
		str2=no2.getNo();
		
		System.out.println("��һ�κ���:"+str1);
		System.out.println("�ڶ��κ���:"+str2);
		System.out.println("�����Ƿ����:"+str1.equalsIgnoreCase(str2));
		System.out.println("�Ƿ�����ͬ����"+(str1==str2));
		
	}
}
