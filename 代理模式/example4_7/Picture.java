package example4_7;
//���������ɫ
public class Picture implements AbstractSubject {
	private Application obj;
	
	public Picture(){
		obj=new Application();
	}
	public void run() {
		obj.run();
	}

}
