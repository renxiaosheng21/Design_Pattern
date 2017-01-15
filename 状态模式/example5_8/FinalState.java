package example5_8;
//具体状态类  骨灰级状态类
public class FinalState extends RoleState {

	public FinalState(RoleState state) {
		this.point=state.point;
		this.grade="骨灰级";
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
		System.out.println("高手级玩家win则获得双倍积分");
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
		System.out.println(this.role.getName()+"玩家换牌了，减少积分");
		this.point-=score;
		check(score);
		System.out.println("剩余积分："+this.point);
	}

	public void peekCards(int score) {
		System.out.println(this.role.getName()+"玩家偷看了，减少积分");
		//System.out.println(this.role.getName()+"玩家换牌了，减少积分");
		this.point-=score;
		check(score);
		System.out.println("剩余积分："+this.point);
	}

	public void check(int score) {
		if(this.point<=5000){//高手级
			this.role.setState(new ProfessionalState(this));
		}
	}

}
