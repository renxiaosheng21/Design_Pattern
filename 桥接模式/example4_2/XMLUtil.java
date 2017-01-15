package example4_2;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
public class XMLUtil
{
    //该方法用于从XML配置文件中提取品牌名称，并返回该品牌名称
	public static Object getBean(String args)
	{
		try
		{
			//创建文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;							
			doc = builder.parse(new File("src/config.xml")); 
		
			//获取包含品牌名称的文本节点
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
