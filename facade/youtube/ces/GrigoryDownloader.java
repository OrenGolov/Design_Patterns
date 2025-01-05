package facade.youtube.ces;

public class GrigoryDownloader implements YoutubeDownloader{

	@Override
	public MP3 getMP3(String url) {
		return Converter.converToMP3(Downloader.getMP4(Youtube.getMovieBytes(url)));
	}

}
