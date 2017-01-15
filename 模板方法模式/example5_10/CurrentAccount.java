package example5_10;
//具体子类   活期账户
public class CurrentAccount extends Account {

	public void getUserType() {
		System.out.println("活期账户");
	}

	public void calculateInterest() {
		System.out.println("按照活期利率计算利息");
	}

}
