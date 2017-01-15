package example3_4;
//建造者模式
public class Main {
	public static void main(String args[]){
		Builder builder=(Builder) XMLUtil.getBean();
		Director director=new Director();
		
		director.setBuilder(builder);
		Product product=director.construct();
		
		System.out.println("计算机组成：");
		System.out.println(product.getPartA());
		System.out.println(product.getPartB());
		System.out.println(product.getPartC());
		System.out.println(product.getPartD());
		System.out.println(product.getPartE());
	}
}
