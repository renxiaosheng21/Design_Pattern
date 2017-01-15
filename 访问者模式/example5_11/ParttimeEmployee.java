package example5_11;
//具体元素类
public class ParttimeEmployee implements Employee {
	private String name;
	private double hourWage;
	private int workTime;

	public ParttimeEmployee(String name, double hourWage, int workTime) {
		this.name = name;
		this.hourWage = hourWage;
		this.workTime = workTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHourWage() {
		return hourWage;
	}

	public void setHourWage(double hourWage) {
		this.hourWage = hourWage;
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
