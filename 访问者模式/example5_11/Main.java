package example5_11;
//������ģʽ
public class Main {

	public static void main(String[] args) {
		EmployeeList list=new EmployeeList();
		Employee fte1,fte2,fte3,pte1,pte2;
		
		fte1=new FulltimeEmployee("����",3200.0,40);
		fte2=new FulltimeEmployee("����",4000.0,30);
		fte3=new FulltimeEmployee("����",3600.0,35);
		
		pte1=new ParttimeEmployee("����",80,25);
		pte2=new ParttimeEmployee("����",90,20);
		
		list.addEmployee(fte1);
		list.addEmployee(fte2);
		list.addEmployee(fte3);
		list.addEmployee(pte1);
		list.addEmployee(pte2);
		
		Department fa,hr;
		
		fa=new FADepartment();
		hr=new HRDepartment();
		
		System.out.println("���񲿴������ݣ�");
		list.accept(fa);
		System.out.println("---------------------");
		System.out.println("������Դ���������ݣ�");
		list.accept(hr);
		
		
	}

}
