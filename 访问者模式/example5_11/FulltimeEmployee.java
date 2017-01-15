package example5_11;
//具体元素类
public class FulltimeEmployee implements Employee {
	private String name;
	private double weeklyWage;
	private int workTime;
	
	public FulltimeEmployee(String name, double weeklyWage, int workTime) {
		this.name = name;
		this.weeklyWage = weeklyWage;
		this.workTime = workTime;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getWeeklyWage() {
		return weeklyWage;
	}


	public void setWeeklyWage(double weeklyWage) {
		this.weeklyWage = weeklyWage;
	}


	public int getWorkTime() {
		return workTime;
	}


	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}


	public void accept(Department handle) {
		handle.vist(this);
	}

}
