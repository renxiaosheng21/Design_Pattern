package example3_2;

public class JpgReaderFactory implements ImageReaderFactory {

	public ImageReader produceImage() {
		System.out.println("JpgͼƬ���ڱ�����...");
		return new JpgReader();
	}

}
