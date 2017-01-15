package example3_1;
//¼òµ¥¹¤³§
public class Main {

	public static void main(String[] args) {
		try
        {
			Person person;
         	String brandName=XMLUtilPerson.getBrandName();
         	person=PersonFactory.producePerson(brandName);
         	person.play();
			
        }catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
	}

}
