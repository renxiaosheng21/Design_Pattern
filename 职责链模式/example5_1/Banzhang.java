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
            System.out.println("班长"+name+"下达代号为"+request.getCode()+"的作战任务，敌人数量为"+request.getEnemyNumber());
        }
        else{
            System.out.println("敌人数量过多，班长无法处理，交由上级处理");
            if(this.successor!=null){
                this.successor=successor;
            }
        }
    }
}
