package example4_1;
//ÊÊÅäÆ÷Ä£Ê½   Ë«ÏòÅäÖÃÆ÷
public class Main {
	public static void main(String [] args){
		Dog dog=(Dog)XMLUtil.getBean();
		dog.wang();
		dog.action();
	}
}
