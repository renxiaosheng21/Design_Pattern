package example3_6;

public class SnoCard {
	private static SnoCard instance=null;
	private String no;
	private SnoCard(){
		
	}
	
	public static SnoCard getInstance(){
		if(instance == null){
			System.out.println("��һ�ε�ѧ�ţ������º���");
			instance=new SnoCard();
			instance.setNo("201416920415");
		}
		else{
			System.out.println("�ظ�����ѧ��ѧ�ţ���ȡ�ɺ���");
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
