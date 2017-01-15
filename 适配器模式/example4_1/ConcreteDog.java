package example4_1;
//狗的适配器类
public class ConcreteDog implements Dog {

	@Override
	public void wang() {
		System.out.println("狗旺旺叫...");
	}

	@Override
	public void action() {
		System.out.println("狗用四条腿走路...");
	}

}
