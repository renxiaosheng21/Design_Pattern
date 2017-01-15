package example5_3;

import java.util.Stack;

public class Context {
	//private String statement;
	private Node node;
	
	public void parse(String statement){
		Node left=null,right=null;
		Stack<Node> stack=new Stack<Node>();
		String []statementArr=statement.split(" ");
		
		for(int i=0;i<statementArr.length;i++){
			if(statementArr[i].equalsIgnoreCase("and")){
				left=(Node)stack.pop();
				int val=Integer.parseInt(statementArr[++i]);
				right=new ValueNode(val);
				stack.push(new AndNode(left,right));
			}
			
			else if(statementArr[i].equalsIgnoreCase("or")){
				left=(Node)stack.pop();
				int val=Integer.parseInt(statementArr[++i]);
				right=new ValueNode(val);
				stack.push(new OrNode(left,right));
			}
			
			else{
				stack.push(new ValueNode(Integer.parseInt(statementArr[i])));
			}
		}
		this.node=(Node)stack.pop();
	}
	
	public int execute(){
		return node.interpret();
	}
}
