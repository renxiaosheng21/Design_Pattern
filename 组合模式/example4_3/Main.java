package example4_3;
//���ģʽ
public class Main {

	public static void main(String[] args) {
		MyElement obj1,obj2,obj3;
		Office office1,office2;
		
		obj1=new Business();//new ҵ�������
		obj2=new Technology();//new ���������
		office1=new Office();
		office1.add(obj1);
		office1.add(obj2);
		
		office2=new Office();
		obj3=new Technology();
		office2.add(office1);
		office2.add(obj3);
		
		office2.send();
		
	}

}
