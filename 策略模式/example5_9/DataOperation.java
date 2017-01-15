package example5_9;
//ª∑æ≥¿‡
public class DataOperation {
	private Cipher cipher;

	public void setCipher(Cipher cipher) {
		this.cipher = cipher;
	}
	
	public String doEncrypt(int key,String plainText){
		return cipher.doEncrypt(key, plainText);
	}
}
