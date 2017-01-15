package example4_2;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
public class XMLUtil
{
    //�÷������ڴ�XML�����ļ�����ȡƷ�����ƣ������ظ�Ʒ������
	public static Object getBean(String args)
	{
		try
		{
			//�����ĵ�����
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;							
			doc = builder.parse(new File("src/config.xml")); 
		
			//��ȡ����Ʒ�����Ƶ��ı��ڵ�
			NodeList nl = doc.getElementsByTagName("className");
            Node classNode=null;
            String cName=null;
            
            if(args.equals("electricEquipment")){
            	classNode=nl.item(0).getFirstChild();
            }
            else if(args.equals("electronicsMaker")){
            	classNode=nl.item(1).getFirstChild();
            }
            cName=classNode.getNodeValue();
            
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
