package example5_4;

/**
 * Created by RYH on 2016/12/12.
 */
public class Student {
    private String sname;
    private int sage;
    private String ssex;
    
	public Student(String sname, int sage, String ssex) {
		this.sname = sname;
		this.sage = sage;
		this.ssex = ssex;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}

   
}
