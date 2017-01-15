package example4_7;
//代理主题角色
public class Picture implements AbstractSubject {
	private Application obj;
	
	public Picture(){
		obj=new Application();
	}
	public void run() {
		obj.run();
	}

}
