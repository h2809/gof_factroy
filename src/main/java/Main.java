public class Main {
	public static void main(String[] args) {
		AbstractDataReader reader = null;

		Factory factory = new Factory();
		reader = factory.create("markdown");

		String filenameExtension = reader.getFilenameExtension();
        System.out.println(filenameExtension);
	}
}
