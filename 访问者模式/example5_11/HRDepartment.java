package example5_11;

public class HRDepartment extends Department {

	public void vist(FulltimeEmployee employee) {
		int workTime=employee.getWorkTime();
		System.out.println("��ʽԱ��"+employee.getName()+"ʵ�ʹ���ʱ��Ϊ��"+workTime+"Сʱ");
		
		if(workTime>40){
			System.out.println("��ʽԱ��"+employee.getName()+"�Ӱ�ʱ��Ϊ��"+(workTime-40)+"Сʱ");
		}
		else if(workTime<40){
			System.out.println("��ʽԱ��"+employee.getName()+"���ʱ��Ϊ��"+(40-workTime)+"Сʱ");
		}
	}

	public void vist(ParttimeEmployee employee) {
		int workTime=employee.getWorkTime();
		System.out.println("��ʱԱ��"+employee.getName()+"ʵ�ʹ���ʱ��Ϊ��"+workTime+"Сʱ");
	}

}
