package example5_7;
//����Ŀ����
public class Army extends MySubject {
	public void attach(){
		System.out.println("���˿�ʼ������");
		System.out.println("------------------");
		
		for(Object obs:observers){
			((MyObserver)obs).response();
		}
	}
}
