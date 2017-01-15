package example3_3;
//抽象工厂方法
public class Main {
	public static void main(String args[]){
		try{
			Factory factory;
			CPU cpu;
			RAM ram;
			factory=(Factory)XMLUtil.getBean();
			
			cpu=factory.produceCPU();
			cpu.play();
			
			ram=factory.produceRAM();
			ram.play();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
