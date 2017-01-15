package example4_2;
//TCL厂商  扩充抽象类
public class TCL extends ElectronicsMaker {
    @Override
    public void produce() {
        String makerName="TCL厂商生产 ";
        this.equipment.beProduce(makerName);
    }
}