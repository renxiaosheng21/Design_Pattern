package example5_3;

public class AndNode implements Node {

	private Node left;
	private Node right;
	
	public AndNode(Node left, Node right) {
		this.left = left;
		this.right = right;
	}

	public int interpret() {
		if(left.interpret()==1&&right.interpret()==1){
			return 1;
		}
		else{
			return 0;
		}
	}

}
