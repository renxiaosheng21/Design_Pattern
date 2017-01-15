package example5_9;
//具体策略类
public class CaesarCipher implements Cipher {

	public String doEncrypt(int key, String plainText) {
		
		StringBuilder result = new StringBuilder();
	      for (char c:plainText.toCharArray())
	      {
	         // 如果字符串中的某个字符是小写字母
	         if (c>='a' && c<='z')
	         {
	            c+=key % 26; // 移动key%26位
	            if(c<'a')
	               c+=26; // 向左超界
	            if (c>'z')
	               c-= 26; // 向右超界
	         }
	         // 如果字符串中的某个字符是大写字母
	         else if (c>='A'&&c<='Z')
	         {
	            c+=key%26; // 移动key%26位
	            if (c<'A')
	               c+=26;// 同上
	            if (c>'Z')
	               c-=26;// 同上
	         }
	         result.append(c);
	      }
	      return result.toString();
	}

}
