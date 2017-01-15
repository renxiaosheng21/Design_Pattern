package example5_8;
//具体状态类    入门级状态类
public class PrimaryState extends RoleState {

	public PrimaryState(PlayerRole role) {
		this.point=0;
		this.grade="入门级";
		this.role=role;
	}

	public PrimaryState(RoleState state) {
		this.point=state.getPoint();
		this.grade="入门级";
		this.role=state.role;
	}
	
	public void play(int score, String result) {
		if(result.equalsIgnoreCase("win")){
			this.point+=score;
			System.out.println("玩家"+this.role.getName()+"获胜，增加积分"+score+",当前积分为："+this.point);
		}
		else if(result.equalsIgnoreCase("lose")){
			this.point-=score;
			System.out.println("玩家"+this.role.getName()+"失败，减少积分"+score+",当前积分为："+this.point);
		}
		this.check(score);
	}

	public void doubleScore(int score, String result) {
		System.out.println("入门级玩家暂时不支持双倍积分功能！");
		check(score);
	}

	public void changeCards(int score) {
		System.out.println("入门级玩家暂时不支持换牌功能！");
	}

	public void peekCards(int score) {
		System.out.println("入门级玩家暂时不支持偷看功能！");
	}

	public void check(int score) {
		if(this.point>=10000){  //骨灰级
			this.role.setState(new FinalState(this));
		}
		else if(this.point>=5000&&this.point<10000){//专业级
			this.role.setState(new ProfessionalState(this));
		}
		else if(this.point>=1000&&this.point<5000){//熟练级
			this.role.setState(new SecondaryState(this));
		}
	}

}
