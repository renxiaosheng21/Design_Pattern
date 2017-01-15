package example5_3;

public class OrNode implements Node {

	private Node left;
	private Node right;
	
	public OrNode(Node left, Node right) {
		this.left = left;
		this.right = right;
	}

	public int interpret() {
		if(left.interpret()==1||right.interpret()==1){
			return 1;
		}
		else{
			return 0;
		}
	}

}
