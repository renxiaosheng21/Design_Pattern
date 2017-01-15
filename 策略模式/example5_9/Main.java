package example5_9;

public class Main {

	public static void main(String[] args) {
		String str="abc";
		DataOperation don=new DataOperation();
		
		Cipher cipher=new CaesarCipher();
		don.setCipher(cipher);
		
		String result=don.doEncrypt(-3,str);//key为正数时向右输出，为负数则向左输出
		System.out.print(str+"经过加密之后变为:");
		System.out.println(result);
	}

}
