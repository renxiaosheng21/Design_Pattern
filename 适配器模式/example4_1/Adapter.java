package example4_1;
//��������  
public class Adapter implements Dog, Cat {

	private Dog dog;//Ŀ����   ���������ࣩ
	private Cat cat;//��������  (Ŀ����)

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		dog.wang();
	}

	@Override
	public void catchMouse() {
		// TODO Auto-generated method stub
		cat.catchMouse();
	}

	@Override
	public void wang() {
		// TODO Auto-generated method stub
		dog.wang();
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		cat.catchMouse();
	}

}
