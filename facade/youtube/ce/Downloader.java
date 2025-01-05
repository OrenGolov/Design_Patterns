package facade.youtube.ce;

public class Downloader {
	
	public MP4 getMP4(byte[] bytes) {
		return new MP4(bytes);
		
	}

}
