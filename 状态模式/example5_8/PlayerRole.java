package example5_8;
//环境类
public class PlayerRole {
	private String name;
	private RoleState state;
	
	public PlayerRole(String name){
		this.name=name;
		this.state=new PrimaryState(this);
		System.out.println(this.name+"注册成功");
		System.out.println("---------------------------");
	}

	public String getName() {
		return name;
	}

	public RoleState getState() {
		return state;
	}

	public void setState(RoleState state) {
		this.state = state;
	}
	
	public void play(int score,String result){
		state.play(score, result);
	}
	
	public void doubleScore(int score,String result){
		state.doubleScore(score, result);
	}
	
	public void changeCards(int score){
		state.changeCards(score);
	}
	
	public void peekCards(int score){
		state.peekCards(score);
	}
}
