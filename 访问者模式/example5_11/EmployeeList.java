package example5_11;

import java.util.ArrayList;

public class EmployeeList {
	private ArrayList list=new ArrayList();
	
	public void addEmployee(Employee employee){
		list.add(employee);
	}
	public void accept(Department handler){
		for(Object obj:list){
			((Employee)obj).accept(handler);
		}
	}
}
