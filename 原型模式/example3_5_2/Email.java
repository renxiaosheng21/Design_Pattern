package example3_5_2;

import java.io.*;

public class Email implements Serializable 
{
	private static final long serialVersionUID = 1L;
	private Attachment attachment=null;
	
	public Email()
	{
		this.attachment=new Attachment();
	}
	
	public Object deepClone() throws IOException, ClassNotFoundException, OptionalDataException
	{
		//将对象写入流中
		ByteArrayOutputStream bao=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bao);
		oos.writeObject(this);
		
		//将对象从流中去除
		ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(bis);
		return(ois.readObject());
	}
	
	public Attachment getAttachment()
	{
		return this.attachment;
	}
	
	public void display()
	{
		System.out.println("查看邮件");	
	}
	
}