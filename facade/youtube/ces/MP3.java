package facade.youtube.ces;


public class MP3 {
	private byte[] data;
	
	public MP3(byte[] bytes) {
		this.data = bytes;
	}

	public byte[] getBytes() {
		return data;
	}

	@Override
	public String toString() {
		return "MP3 File[downloaded from " + new String(data) + "]";
	}

	
	
	
	
	
	
}
