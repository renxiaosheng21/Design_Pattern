package example3_1;

public class PersonFactory {
	public static Person producePerson(String brand) throws Exception
	{
		if(brand.equalsIgnoreCase("test2_1.Man"))
		{
			System.out.println("女娲正在创造男人......");
			return new Man();
		}
		else if(brand.equalsIgnoreCase("test2_1.Woman"))
		{
			System.out.println("女娲正在创造女人....");
			return new Woman();
		}
		else if(brand.equalsIgnoreCase("test2_1.Robot"))
		{
			System.out.println("女娲正在创造机器人");
			return new Robot();
		}
		else
		{
			throw new Exception("对不起，现在我还是一团泥土，女娲还没有把我造出来！");
		}
	}
}
