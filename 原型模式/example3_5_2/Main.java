package example3_5_2;
//ԭ��ģʽ--���¡
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
