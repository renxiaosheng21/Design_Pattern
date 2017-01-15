package example4_6;
//享元工厂类
import java.util.Hashtable;

public class SharedStringFactory {
	private Hashtable<String, SharedString> ht;
	
	public SharedStringFactory(){
		ht=new Hashtable<String, SharedString>();
	}
	public SharedString getSharedString(String arg){
		if(ht.containsKey(arg)){
			return (SharedString)ht.get(arg);
		}
		else{
			SharedString str= new SharedString(arg);
			ht.put(arg, str);
			return (SharedString)ht.get(arg);
		}
	}
}
