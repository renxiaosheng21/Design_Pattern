package example3_3;

public class macFactory implements Factory {

	public CPU produceCPU() {
		System.out.println("mac ϵͳCPU���ڱ�����...");
		return new macCPU();
	}

	public RAM produceRAM() {
		System.out.println("mac ϵͳRAM���ڱ�����...");
		return new macRAM();
	}

}
