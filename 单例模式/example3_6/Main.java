package example3_6;
//单例模式
public class Main {
	public static void main(String a[]){
		SnoCard no1,no2;
		no1=SnoCard.getInstance();
		no2=SnoCard.getInstance();
		System.out.println("学生学号是否一致："+(no1==no2));
		
		String str1,str2;
		str1=no1.getNo();
		str2=no2.getNo();
		
		System.out.println("第一次号码:"+str1);
		System.out.println("第二次号码:"+str2);
		System.out.println("内容是否相等:"+str1.equalsIgnoreCase(str2));
		System.out.println("是否是相同对象："+(str1==str2));
		
	}
}
