package example3_4;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
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
				NodeList nl = doc.getElementsByTagName("className2");
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
