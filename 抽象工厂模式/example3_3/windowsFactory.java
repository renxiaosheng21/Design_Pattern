package example3_3;

public class windowsFactory implements Factory {

	public CPU produceCPU() {
		System.out.println("windows 系统CPU正在被生产...");
		return new windowsCPU();
	}

	public RAM produceRAM() {
		System.out.println("windows 系统RAM正在被生产...");
		return new windowsRAM();
	}

}
