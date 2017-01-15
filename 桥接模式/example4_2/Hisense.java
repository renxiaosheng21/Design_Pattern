package example4_2;
//海信厂商  扩充抽象类
public class Hisense extends ElectronicsMaker {
    @Override
    public void produce() {
        String makerName="海信 厂商生产 ";
        this.equipment.beProduce(makerName);
    }
}
