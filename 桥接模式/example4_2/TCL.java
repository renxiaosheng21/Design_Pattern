package example4_2;
//TCL����  ���������
public class TCL extends ElectronicsMaker {
    @Override
    public void produce() {
        String makerName="TCL�������� ";
        this.equipment.beProduce(makerName);
    }
}