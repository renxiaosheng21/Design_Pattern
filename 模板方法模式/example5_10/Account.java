package example5_10;
//������
public abstract class Account {
	public abstract void getUserType();
	public abstract void calculateInterest();
	public void findUser(){
		System.out.println("��ѯ�û���Ϣ");
	}
	
	public void display(){
		System.out.println("��ʾ��Ϣ");
	}
	
	public void handle(){
		findUser();
		getUserType();
		calculateInterest();
		display();
	}
}
