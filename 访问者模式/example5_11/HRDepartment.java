package example5_11;

public class HRDepartment extends Department {

	public void vist(FulltimeEmployee employee) {
		int workTime=employee.getWorkTime();
		System.out.println("正式员工"+employee.getName()+"实际工作时间为："+workTime+"小时");
		
		if(workTime>40){
			System.out.println("正式员工"+employee.getName()+"加班时间为："+(workTime-40)+"小时");
		}
		else if(workTime<40){
			System.out.println("正式员工"+employee.getName()+"请假时间为："+(40-workTime)+"小时");
		}
	}

	public void vist(ParttimeEmployee employee) {
		int workTime=employee.getWorkTime();
		System.out.println("临时员工"+employee.getName()+"实际工作时间为："+workTime+"小时");
	}

}
