package example5_1;

/**
 * Created by RYH on 2016/12/12.
 * ְ����ģʽ
 */
public class Main {
    public static void main(String []args){
        Officer objBanzhang,objPaizhang,objYingzhang;

        objBanzhang=new Banzhang("����");
        objPaizhang=new Paizhang("����");
        objYingzhang=new Yingzhang("����");

        objBanzhang.setSuccessor(objPaizhang);
        objPaizhang.setSuccessor(objYingzhang);

        Mission mission1=new Mission("a001",6);
        objBanzhang.handleRequest(mission1);

        Mission mission2=new Mission("a002",100);
        objPaizhang.handleRequest(mission2);

        Mission mission3=new Mission("a003",300);
        objYingzhang.handleRequest(mission3);
    }
}
