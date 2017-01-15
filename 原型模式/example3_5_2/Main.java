package example3_5_2;
//原型模式--深克隆
public class Main {
	public static void main(String a[])
	{
		Email email,copyEmail=null;
		
		email=new Email();
		
		try{
		    copyEmail=(Email)email.deepClone();	
		}
		catch(Exception e)
	    {
	   		e.printStackTrace();
	    }	
 
		
		System.out.println("email==copyEmail?");
		System.out.println(email==copyEmail);
		
		System.out.println("email.getAttachment==copyEmail.getAttachment?"); 
		System.out.println(email.getAttachment()==copyEmail.getAttachment());			
	}
}
