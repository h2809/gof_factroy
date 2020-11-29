public class Factory {
	public final AbstractDataReader create(String dataName) {
		AbstractDataReader reader = null;

		switch (dataName) {
			case "markdown":
				reader = new MarkdownDataReader();
				break;
			default:
				break;
		}

		return reader;
	}

}
