package example5_3;
//½âÊÍÆ÷Ä£Ê½
public class Main {

	public static void main(String[] args) {
		String statement="0 or 1 and 1 or 1";
		Context ctx=new Context();
		ctx.parse(statement);
		int result=ctx.execute();
		System.out.println(statement+" = "+result);
	}

}
