package example3_2;
//工厂方法
public class Main {
	public static void main(String[] args)
	{
		try{
			ImageReader reader;
			ImageReaderFactory factory;
			factory=(ImageReaderFactory)XMLUtilImage.getBean();
			reader=factory.produceImage();
			reader.read();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}	
}
