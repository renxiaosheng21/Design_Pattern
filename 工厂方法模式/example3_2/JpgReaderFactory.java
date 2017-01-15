package example3_2;

public class JpgReaderFactory implements ImageReaderFactory {

	public ImageReader produceImage() {
		System.out.println("Jpg图片正在被制造...");
		return new JpgReader();
	}

}
