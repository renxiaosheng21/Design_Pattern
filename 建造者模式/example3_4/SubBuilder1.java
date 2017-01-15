package example3_4;
//具体建造者类2
public class SubBuilder1 extends Builder {

	public void buildPartA() {
		product.setPartA("CPU1");
	}

	@Override
	public void buildPartB() {
		product.setPartB("内存1");
	}

	@Override
	public void buildPartC() {
		product.setPartC("硬盘1");
	}

	@Override
	public void buildPartD() {
		product.setPartD("主机1");
	}

	@Override
	public void buildPartE() {
		product.setPartE("显示器1");
	}

}
