package example3_6;

public class SnoCard {
	private static SnoCard instance=null;
	private String no;
	private SnoCard(){
		
	}
	
	public static SnoCard getInstance(){
		if(instance == null){
			System.out.println("第一次的学号，分配新号码");
			instance=new SnoCard();
			instance.setNo("201416920415");
		}
		else{
			System.out.println("重复办理学生学号，获取旧号码");
		}
		return instance;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	
	
	
}
