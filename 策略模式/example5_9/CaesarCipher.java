package example5_9;
//���������
public class CaesarCipher implements Cipher {

	public String doEncrypt(int key, String plainText) {
		
		StringBuilder result = new StringBuilder();
	      for (char c:plainText.toCharArray())
	      {
	         // ����ַ����е�ĳ���ַ���Сд��ĸ
	         if (c>='a' && c<='z')
	         {
	            c+=key % 26; // �ƶ�key%26λ
	            if(c<'a')
	               c+=26; // ���󳬽�
	            if (c>'z')
	               c-= 26; // ���ҳ���
	         }
	         // ����ַ����е�ĳ���ַ��Ǵ�д��ĸ
	         else if (c>='A'&&c<='Z')
	         {
	            c+=key%26; // �ƶ�key%26λ
	            if (c<'A')
	               c+=26;// ͬ��
	            if (c>'Z')
	               c-=26;// ͬ��
	         }
	         result.append(c);
	      }
	      return result.toString();
	}

}
