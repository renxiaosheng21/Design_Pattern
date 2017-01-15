package example5_8;
//状态模式
public class Main {

	public static void main(String[] args) {
		PlayerRole role = new PlayerRole("张三");
		role.play(1000, "win");
		role.doubleScore(3000, "win");
		
		role.changeCards(200);//换牌
		role.peekCards(300);//偷看
	}
}
