package example5_8;
//����״̬��  ������״̬��
public class SecondaryState extends RoleState {

	
	public SecondaryState(RoleState state) {
		this.point=state.point;
		this.grade="������";
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
		System.out.println("�����������ʱ��֧�ֻ��ƹ��ܣ�");
	}

	public void peekCards(int score) {
		System.out.println("�����������ʱ��֧��͵�����ܣ�");
	}

	public void check(int score) {
		if(this.point>=5000){//רҵ��
			this.role.setState(new ProfessionalState(this));
		}
		else if(point<=1000){//���ּ�
			this.role.setState(new  PrimaryState(this));
		}
	}

}
