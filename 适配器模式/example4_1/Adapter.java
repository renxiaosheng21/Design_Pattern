package example4_1;
//适配器类  
public class Adapter implements Dog, Cat {

	private Dog dog;//目标类   （适配者类）
	private Cat cat;//适配者类  (目标类)

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
