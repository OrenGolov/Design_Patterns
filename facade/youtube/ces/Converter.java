package facade.youtube.ces;

public class Converter {
	public static MP3 converToMP3(MP4 FileMP4) {
		return new MP3(FileMP4.getBytes());
	}
}
