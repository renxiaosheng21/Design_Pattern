package example5_10;
//具体子类   定期账户
public class SavingAccount extends Account {

	public void getUserType() {
		System.out.println("定期账户");
	}

	public void calculateInterest() {
		System.out.println("按照定期利率计算利息");
	}

}
