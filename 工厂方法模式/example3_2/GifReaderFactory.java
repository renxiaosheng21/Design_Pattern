package example3_2;

public class GifReaderFactory implements ImageReaderFactory {

	public ImageReader produceImage() {
		System.out.println("Gif图片正在被制造...");
		return new GifReader();
	}
}
