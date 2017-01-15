package example5_6;
//����¼ģʽ
public class Main {
	private static int index=-1;
	private static MementCaretaker mc=new MementCaretaker();
	
	public static void main(String[] args) {
		Chessman chess=new Chessman("��",1,1);
		play(chess);
		chess.setY(5);
		play(chess);
		chess.setX(5);
		play(chess);
		
		undo(chess,index);
		undo(chess,index);//����
		
		redo(chess,index);
		redo(chess,index);//��������
	}
	//����
	public static void play(Chessman chess){
		mc.setMementoto(chess.save());
		index++;
		System.out.println("����"+chess.getLabel()+"��ǰλ��Ϊ:"+"��"+chess.getX()+"��"+"��"+chess.getY()+"�С�");
	}
	//����
	public static void undo(Chessman chess,int i){
		System.out.println("");
		System.out.println("----------����-----------");
		
		index--;
		chess.restore(mc.getMemento(i-1));
		System.out.println("����"+chess.getLabel()+"��ǰλ��Ϊ:"+"��"+chess.getX()+"��"+"��"+chess.getY()+"�С�");
	}
	//��������
	public static void redo(Chessman chess,int i){
		System.out.println("");
		System.out.println("---------��������---------");
		
		index++;
		chess.restore(mc.getMemento(i+1));
		System.out.println("����"+chess.getLabel()+"��ǰλ��Ϊ:"+"��"+chess.getX()+"��"+"��"+chess.getY()+"�С�");
		
	}

}
