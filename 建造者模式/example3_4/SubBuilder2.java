package example3_4;
//���彨������2
public class SubBuilder2 extends Builder {

	@Override
	public void buildPartA() {
		product.setPartA("CPU2");
	}

	@Override
	public void buildPartB() {
		product.setPartB("�ڴ�2");
	}

	@Override
	public void buildPartC() {
		product.setPartC("Ӳ��2");
	}

	@Override
	public void buildPartD() {
		product.setPartD("����2");
	}

	@Override
	public void buildPartE() {
		product.setPartE("��ʾ��2");
	}

}
