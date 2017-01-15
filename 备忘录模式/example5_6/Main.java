package example5_6;
//备忘录模式
public class Main {
	private static int index=-1;
	private static MementCaretaker mc=new MementCaretaker();
	
	public static void main(String[] args) {
		Chessman chess=new Chessman("车",1,1);
		play(chess);
		chess.setY(5);
		play(chess);
		chess.setX(5);
		play(chess);
		
		undo(chess,index);
		undo(chess,index);//悔棋
		
		redo(chess,index);
		redo(chess,index);//撤销悔棋
	}
	//下棋
	public static void play(Chessman chess){
		mc.setMementoto(chess.save());
		index++;
		System.out.println("棋子"+chess.getLabel()+"当前位置为:"+"第"+chess.getX()+"行"+"第"+chess.getY()+"列。");
	}
	//悔棋
	public static void undo(Chessman chess,int i){
		System.out.println("");
		System.out.println("----------悔棋-----------");
		
		index--;
		chess.restore(mc.getMemento(i-1));
		System.out.println("棋子"+chess.getLabel()+"当前位置为:"+"第"+chess.getX()+"行"+"第"+chess.getY()+"列。");
	}
	//撤销悔棋
	public static void redo(Chessman chess,int i){
		System.out.println("");
		System.out.println("---------撤销悔棋---------");
		
		index++;
		chess.restore(mc.getMemento(i+1));
		System.out.println("棋子"+chess.getLabel()+"当前位置为:"+"第"+chess.getX()+"行"+"第"+chess.getY()+"列。");
		
	}

}
