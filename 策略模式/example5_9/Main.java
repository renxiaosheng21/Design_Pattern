package example5_9;

public class Main {

	public static void main(String[] args) {
		String str="abc";
		DataOperation don=new DataOperation();
		
		Cipher cipher=new CaesarCipher();
		don.setCipher(cipher);
		
		String result=don.doEncrypt(-3,str);//keyΪ����ʱ���������Ϊ�������������
		System.out.print(str+"��������֮���Ϊ:");
		System.out.println(result);
	}

}
