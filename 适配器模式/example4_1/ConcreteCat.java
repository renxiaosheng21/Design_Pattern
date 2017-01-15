package example4_1;
//ÊÊÅäÆ÷Àà   Ã¨µÄ
public class ConcreteCat implements Cat {

	@Override
	public void cry() {
		System.out.println("Ã¨ß÷ß÷½Ğ..");
	}

	@Override
	public void catchMouse() {
		System.out.println("Ã¨×¥ÀÏÊó...");
	}

}
