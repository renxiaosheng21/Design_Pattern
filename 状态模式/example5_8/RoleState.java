package example5_8;
//����״̬��
public abstract class RoleState {
	protected PlayerRole role;
	protected int point;
	protected String grade;
	
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public abstract void check(int score);
	//�������ж���ĳ��󷽷�����Ҫ��������ʵ��
	public  void play(int score,String result){
		if(result.equalsIgnoreCase("win")){
			this.point+=score;
			System.out.println("���"+this.role.getName()+"��ʤ�����ӻ���"+score+",��ǰ����Ϊ��"+this.point);
		}
		else if(result.equalsIgnoreCase("lose")){
			this.point-=score;
			System.out.println("���"+this.role.getName()+"ʧ�ܣ����ٻ���"+score+",��ǰ����Ϊ��"+this.point);
		}
		this.check(score);
	}
	
	public  void doubleScore(int score,String result){
		if(result.equalsIgnoreCase("win")){
			this.point+=score;
			System.out.println("���"+this.role.getName()+"��ʤ�����ӻ���"+score+",��ǰ����Ϊ��"+this.point);
		}
		else if(result.equalsIgnoreCase("lose")){
			this.point-=score;
			System.out.println("���"+this.role.getName()+"ʧ�ܣ����ٻ���"+score+",��ǰ����Ϊ��"+this.point);
		}
		this.check(score);
	}
	
	public  void changeCards(int score)//����
	{
		System.out.println(role.getName()+"�����ˣ�����"+score+"����");
		this.point-=score;
		check(score);
		System.out.println("ʣ�������:"+this.point);
		
	}
	
	public  void peekCards(int score)//͵��
	{
		System.out.println(role.getName()+"͵���ˣ�����"+score+"����");
		this.point-=score;
		check(score);
		System.out.println("ʣ�������:"+this.point);
	}
	
}
