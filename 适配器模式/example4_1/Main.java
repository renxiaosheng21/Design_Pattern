package example4_1;
//������ģʽ   ˫��������
public class Main {
	public static void main(String [] args){
		Dog dog=(Dog)XMLUtil.getBean();
		dog.wang();
		dog.action();
	}
}
