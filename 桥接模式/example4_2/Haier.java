package example4_2;
//海尔厂商   扩充抽象类
public class Haier extends ElectronicsMaker {
    @Override
    public void produce() {
        String makerName="海尔 厂商生产 ";
        this.equipment.beProduce(makerName);
    }
}
