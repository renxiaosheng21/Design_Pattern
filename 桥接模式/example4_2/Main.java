package example4_2;
//�Ž�ģʽ
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
