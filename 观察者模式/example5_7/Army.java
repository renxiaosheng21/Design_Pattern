package example5_7;
//具体目标类
public class Army extends MySubject {
	public void attach(){
		System.out.println("敌人开始攻击了");
		System.out.println("------------------");
		
		for(Object obs:observers){
			((MyObserver)obs).response();
		}
	}
}
