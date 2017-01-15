package example5_9;
//具体策略类
public class ModCipher implements Cipher {

	@Override
	public String doEncrypt(int key, String plainText) {
		System.out.println("这是DES算法");//没找到参数是int和String类型的DES算法
		
		return null;
	}
	
}
