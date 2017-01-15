package example3_3;

public class macFactory implements Factory {

	public CPU produceCPU() {
		System.out.println("mac 系统CPU正在被生产...");
		return new macCPU();
	}

	public RAM produceRAM() {
		System.out.println("mac 系统RAM正在被生产...");
		return new macRAM();
	}

}
