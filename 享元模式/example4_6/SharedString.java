package example4_6;
//������Ԫ��
public class SharedString {
	private String content;
	private Color color;
	private Size size;
	public SharedString(String context){
		this.content=context;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public void setSize(Size size) {
		this.size = size;
	}
	
	public void display(){
		System.out.println("����:"+this.content
				+",��ɫ:"+this.color.getColor()+",��С��"+this.size.getValue());
	}
	
}
