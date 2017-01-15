package example3_4;
//具体建造者类2
public class SubBuilder2 extends Builder {

	@Override
	public void buildPartA() {
		product.setPartA("CPU2");
	}

	@Override
	public void buildPartB() {
		product.setPartB("内存2");
	}

	@Override
	public void buildPartC() {
		product.setPartC("硬盘2");
	}

	@Override
	public void buildPartD() {
		product.setPartD("主机2");
	}

	@Override
	public void buildPartE() {
		product.setPartE("显示器2");
	}

}
