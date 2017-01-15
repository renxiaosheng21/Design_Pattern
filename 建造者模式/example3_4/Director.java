package example3_4;
//ָ������
public class Director {
	 private Builder builder;
	  
	 public void setBuilder(Builder builder){
		 this.builder=builder;
	 }
	 
	 public Product construct(){
		 builder.buildPartA();
		 builder.buildPartB();
		 builder.buildPartC();
		 builder.buildPartD();
		 builder.buildPartE();
		 return builder.getResult();
	 }
}
