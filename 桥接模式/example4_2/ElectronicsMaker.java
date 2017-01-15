package example4_2;
//抽象类
public abstract class ElectronicsMaker {
	
	protected ElectricEquipment equipment;//定义ElectricEquipment类型对象
    public void setEquipment(ElectricEquipment equipment) {
        this.equipment = equipment;
    }
    public abstract void produce();
}
