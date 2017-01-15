package example3_4;
//抽象建造者类
public abstract class Builder {
	protected Product product=new Product();
	
	public abstract void buildPartA();
	public abstract void buildPartB();
	public abstract void buildPartC();
	public abstract void buildPartD();
	public abstract void buildPartE();
	
	public Product getResult(){
		return product;
	}
}
