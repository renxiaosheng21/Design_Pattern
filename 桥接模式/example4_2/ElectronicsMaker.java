package example4_2;
//������
public abstract class ElectronicsMaker {
	
	protected ElectricEquipment equipment;//����ElectricEquipment���Ͷ���
    public void setEquipment(ElectricEquipment equipment) {
        this.equipment = equipment;
    }
    public abstract void produce();
}
