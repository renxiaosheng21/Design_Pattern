package example3_2;

public class GifReaderFactory implements ImageReaderFactory {

	public ImageReader produceImage() {
		System.out.println("GifͼƬ���ڱ�����...");
		return new GifReader();
	}
}
