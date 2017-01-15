package example3_3;

public class windowsFactory implements Factory {

	public CPU produceCPU() {
		System.out.println("windows ϵͳCPU���ڱ�����...");
		return new windowsCPU();
	}

	public RAM produceRAM() {
		System.out.println("windows ϵͳRAM���ڱ�����...");
		return new windowsRAM();
	}

}
