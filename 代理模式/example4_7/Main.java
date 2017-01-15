package example4_7;
//代理模式
public class Main {

	public static void main(String[] args) {
		AbstractSubject subject;
		subject=(AbstractSubject) XMLUtil.getBean();
		
		subject.run();
	}
}
