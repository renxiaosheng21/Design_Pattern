package example5_1;

/**
 * Created by RYH on 2016/12/12.
 */
public class Paizhang extends Officer {
    public Paizhang(String name){
        super(name);
    }
    public void handleRequest(Mission request){
        if(request.getEnemyNumber()<50&&request.getEnemyNumber()>=10){
            System.out.println("�ų�"+name+"�´����Ϊ"+request.getCode()+"����ս���񣬵�������Ϊ"+request.getEnemyNumber());
        }
        else{
            System.out.println("�����������࣬�ų��޷����������ϼ�����");
            if(this.successor!=null){
                this.successor=successor;
            }
        }
    }
}
