package example5_5;
//抽象同事类
public abstract class Country {
	protected UnitedNations un;

	public void setUn(UnitedNations un) {
		this.un = un;
	}
	
	public void declare(String message){
		un.declare(message, this);//this指的是本类Country的对象
	}
	
	public abstract void getMessage(String message);
	
	
}
