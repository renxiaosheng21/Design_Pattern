package example4_2;
//��������   ���������
public class Haier extends ElectronicsMaker {
    @Override
    public void produce() {
        String makerName="���� �������� ";
        this.equipment.beProduce(makerName);
    }
}
