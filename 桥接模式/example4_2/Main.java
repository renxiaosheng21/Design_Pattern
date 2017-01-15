package example4_2;
//ге╫сдёй╫
public class Main {
	public static void main(String[] args) {
		ElectricEquipment eqt;  
		ElectronicsMaker maker;
		
		eqt=(ElectricEquipment)XMLUtil.getBean("electricEquipment");
		maker=(ElectronicsMaker)XMLUtil.getBean("electronicsMaker");
		
		maker.setEquipment(eqt);
		maker.produce();
	}
}
