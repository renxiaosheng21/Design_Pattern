package example3_1;

public class PersonFactory {
	public static Person producePerson(String brand) throws Exception
	{
		if(brand.equalsIgnoreCase("test2_1.Man"))
		{
			System.out.println("Ů����ڴ�������......");
			return new Man();
		}
		else if(brand.equalsIgnoreCase("test2_1.Woman"))
		{
			System.out.println("Ů����ڴ���Ů��....");
			return new Woman();
		}
		else if(brand.equalsIgnoreCase("test2_1.Robot"))
		{
			System.out.println("Ů����ڴ��������");
			return new Robot();
		}
		else
		{
			throw new Exception("�Բ��������һ���һ��������Ů活�û�а����������");
		}
	}
}
