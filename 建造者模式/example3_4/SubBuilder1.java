package example3_4;
//���彨������2
public class SubBuilder1 extends Builder {

	public void buildPartA() {
		product.setPartA("CPU1");
	}

	@Override
	public void buildPartB() {
		product.setPartB("�ڴ�1");
	}

	@Override
	public void buildPartC() {
		product.setPartC("Ӳ��1");
	}

	@Override
	public void buildPartD() {
		product.setPartD("����1");
	}

	@Override
	public void buildPartE() {
		product.setPartE("��ʾ��1");
	}

}
