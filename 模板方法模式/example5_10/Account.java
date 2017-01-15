package example5_10;
//抽象类
public abstract class Account {
	public abstract void getUserType();
	public abstract void calculateInterest();
	public void findUser(){
		System.out.println("查询用户信息");
	}
	
	public void display(){
		System.out.println("显示利息");
	}
	
	public void handle(){
		findUser();
		getUserType();
		calculateInterest();
		display();
	}
}
