package example5_8;
//״̬ģʽ
public class Main {

	public static void main(String[] args) {
		PlayerRole role = new PlayerRole("����");
		role.play(1000, "win");
		role.doubleScore(3000, "win");
		
		role.changeCards(200);//����
		role.peekCards(300);//͵��
	}
}
