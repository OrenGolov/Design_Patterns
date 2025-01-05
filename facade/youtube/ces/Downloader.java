package facade.youtube.ces;

public class Downloader {
	
	public static MP4 getMP4(byte[] bytes) {
		return new MP4(bytes);
		
	}

}
