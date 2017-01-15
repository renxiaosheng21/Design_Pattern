package example5_8;
//具体状态类  熟练级状态类
public class SecondaryState extends RoleState {

	
	public SecondaryState(RoleState state) {
		this.point=state.point;
		this.grade="熟练级";
		this.role=state.role;
	}

	public void play(int score, String result) {
		if(result.equalsIgnoreCase("win")){
			this.point+=score*2;//熟练级玩家win则获得双倍积分
			System.out.println("玩家"+this.role.getName()+"获胜，增加积分"+score+",当前积分为："+this.point);
		}
		else if(result.equalsIgnoreCase("lose")){
			this.point-=score;
			System.out.println("玩家"+this.role.getName()+"失败，减少积分"+score+",当前积分为："+this.point);
		}
		this.check(score);
	}

	public void doubleScore(int score, String result) {
		if(result.equalsIgnoreCase("win")){
			this.point+=score*2;
			System.out.println("玩家"+this.role.getName()+"获胜，增加积分"+score+",当前积分为："+this.point);
		}
		else if(result.equalsIgnoreCase("lose")){
			this.point-=score;
			System.out.println("玩家"+this.role.getName()+"失败，减少积分"+score+",当前积分为："+this.point);
		}
		this.check(score);
	}

	public void changeCards(int score) {
		System.out.println("熟练级玩家暂时不支持换牌功能！");
	}

	public void peekCards(int score) {
		System.out.println("熟练级玩家暂时不支持偷看功能！");
	}

	public void check(int score) {
		if(this.point>=5000){//专业级
			this.role.setState(new ProfessionalState(this));
		}
		else if(point<=1000){//新手级
			this.role.setState(new  PrimaryState(this));
		}
	}

}
