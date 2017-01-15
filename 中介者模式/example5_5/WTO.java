package example5_5;
//具体中介者类
public class WTO extends UnitedNations {

	private China cn;
	private America us;
	
	
	public void setCn(China cn) {
		this.cn = cn;
	}

	public void setUs(America us) {
		this.us = us;
	}


	public void declare(String message, Country country) {
		if(country==cn){
			us.getMessage(message);
		}
		else{
			cn.getMessage(message);
		}
	}

}
