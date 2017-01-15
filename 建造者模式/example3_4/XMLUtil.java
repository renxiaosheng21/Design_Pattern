package example3_4;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	 //该方法用于从XML配置文件中提取品牌名称，并返回该品牌名称
		public static Object getBean()
		{
			try
			{
				//创建文档对象
				DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = dFactory.newDocumentBuilder();
				Document doc;							
				doc = builder.parse(new File("src/config.xml")); 
			
				//获取包含品牌名称的文本节点
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
