package facade.youtube.ce;

public class Converter {
	public MP3 converToMP3(MP4 FileMP4) {
		return new MP3(FileMP4.getBytes());
	}
}
