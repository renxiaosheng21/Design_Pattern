package example3_2;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
public class XMLUtilImage
{
    //�÷������ڴ�XML�����ļ�����ȡƷ�����ƣ������ظ�Ʒ������
	public static Object getBean()
	{
		try
		{
			//�����ĵ�����
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;							
			doc = builder.parse(new File("src/config.xml")); 
		
			//��ȡ����Ʒ�����Ƶ��ı��ڵ�
			NodeList nl = doc.getElementsByTagName("className3");
            Node classNode=nl.item(0).getFirstChild();
            String cName=classNode.getNodeValue().trim();
            
            Class<?> c=Class.forName(cName);
            Object obj=c.newInstance();
            return obj;
           }   
           	catch(Exception e)
           	{
           		e.printStackTrace();
           		return null;
           	}
		}
}
