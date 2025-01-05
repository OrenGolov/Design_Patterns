package facade.youtube.ces;

public class Main {

	public static void main(String[] args) {
		GrigoryDownloader downloader = new GrigoryDownloader();
		MP3 fileMP3 = downloader.getMP3("https://www.youtube.com/watch?v=-XcUQtsB2GI");
		System.out.println(fileMP3);

	}

}
