package example5_5;
//����ͬ����
public abstract class Country {
	protected UnitedNations un;

	public void setUn(UnitedNations un) {
		this.un = un;
	}
	
	public void declare(String message){
		un.declare(message, this);//thisָ���Ǳ���Country�Ķ���
	}
	
	public abstract void getMessage(String message);
	
	
}
