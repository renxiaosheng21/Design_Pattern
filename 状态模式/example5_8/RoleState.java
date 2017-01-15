package example5_8;
//抽象状态类
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
	//抽象类中定义的抽象方法必须要在子类中实现
	public  void play(int score,String result){
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
	
	public  void doubleScore(int score,String result){
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
	
	public  void changeCards(int score)//换牌
	{
		System.out.println(role.getName()+"换牌了，减少"+score+"积分");
		this.point-=score;
		check(score);
		System.out.println("剩余积分是:"+this.point);
		
	}
	
	public  void peekCards(int score)//偷看
	{
		System.out.println(role.getName()+"偷看了，减少"+score+"积分");
		this.point-=score;
		check(score);
		System.out.println("剩余积分是:"+this.point);
	}
	
}
