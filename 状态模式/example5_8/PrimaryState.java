package example5_8;
//����״̬��    ���ż�״̬��
public class PrimaryState extends RoleState {

	public PrimaryState(PlayerRole role) {
		this.point=0;
		this.grade="���ż�";
		this.role=role;
	}

	public PrimaryState(RoleState state) {
		this.point=state.getPoint();
		this.grade="���ż�";
		this.role=state.role;
	}
	
	public void play(int score, String result) {
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

	public void doubleScore(int score, String result) {
		System.out.println("���ż������ʱ��֧��˫�����ֹ��ܣ�");
		check(score);
	}

	public void changeCards(int score) {
		System.out.println("���ż������ʱ��֧�ֻ��ƹ��ܣ�");
	}

	public void peekCards(int score) {
		System.out.println("���ż������ʱ��֧��͵�����ܣ�");
	}

	public void check(int score) {
		if(this.point>=10000){  //�ǻҼ�
			this.role.setState(new FinalState(this));
		}
		else if(this.point>=5000&&this.point<10000){//רҵ��
			this.role.setState(new ProfessionalState(this));
		}
		else if(this.point>=1000&&this.point<5000){//������
			this.role.setState(new SecondaryState(this));
		}
	}

}
