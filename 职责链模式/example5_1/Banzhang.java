package example5_1;

/**
 * Created by RYH on 2016/12/12.
 */
public class Banzhang extends Officer {
    public Banzhang(String name){
        super(name);
    }

    public void handleRequest(Mission request){
        if(request.getEnemyNumber()<10){
            System.out.println("�೤"+name+"�´����Ϊ"+request.getCode()+"����ս���񣬵�������Ϊ"+request.getEnemyNumber());
        }
        else{
            System.out.println("�����������࣬�೤�޷����������ϼ�����");
            if(this.successor!=null){
                this.successor=successor;
            }
        }
    }
}
