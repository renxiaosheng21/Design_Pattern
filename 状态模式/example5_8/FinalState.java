package example5_8;
//����״̬��  �ǻҼ�״̬��
public class FinalState extends RoleState {

	public FinalState(RoleState state) {
		this.point=state.point;
		this.grade="�ǻҼ�";
		this.role=state.role;
	}

	public void play(int score, String result) {
		if(result.equalsIgnoreCase("win")){
			this.point+=score*2;//���������win����˫������
			System.out.println("���"+this.role.getName()+"��ʤ�����ӻ���"+score+",��ǰ����Ϊ��"+this.point);
		}
		else if(result.equalsIgnoreCase("lose")){
			this.point-=score;
			System.out.println("���"+this.role.getName()+"ʧ�ܣ����ٻ���"+score+",��ǰ����Ϊ��"+this.point);
		}
		this.check(score);
	}

	public void doubleScore(int score, String result) {
		System.out.println("���ּ����win����˫������");
		if(result.equalsIgnoreCase("win")){
			this.point+=score*2;
			System.out.println("���"+this.role.getName()+"��ʤ�����ӻ���"+score+",��ǰ����Ϊ��"+this.point);
		}
		else if(result.equalsIgnoreCase("lose")){
			this.point-=score;
			System.out.println("���"+this.role.getName()+"ʧ�ܣ����ٻ���"+score+",��ǰ����Ϊ��"+this.point);
		}
		this.check(score);
	}

	public void changeCards(int score) {
		System.out.println(this.role.getName()+"��һ����ˣ����ٻ���");
		this.point-=score;
		check(score);
		System.out.println("ʣ����֣�"+this.point);
	}

	public void peekCards(int score) {
		System.out.println(this.role.getName()+"���͵���ˣ����ٻ���");
		//System.out.println(this.role.getName()+"��һ����ˣ����ٻ���");
		this.point-=score;
		check(score);
		System.out.println("ʣ����֣�"+this.point);
	}

	public void check(int score) {
		if(this.point<=5000){//���ּ�
			this.role.setState(new ProfessionalState(this));
		}
	}

}
