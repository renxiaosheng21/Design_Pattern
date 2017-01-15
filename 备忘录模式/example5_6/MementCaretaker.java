package example5_6;
import java.util.ArrayList;
public class MementCaretaker {
	private ArrayList mementolist=new ArrayList();
	
	public ChessmanMemento getMemento(int i){
		return (ChessmanMemento)mementolist.get(i);
	}
	
	public void setMementoto(ChessmanMemento memento){
		mementolist.add(memento);
	}
}
