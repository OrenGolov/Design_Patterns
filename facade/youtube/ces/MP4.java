package facade.youtube.ces;


public class MP4 {
	private byte[] data;
	
	public MP4(byte[] bytes) {
		this.data = bytes;
	}

	public byte[] getBytes() {
		return data;
	}

	@Override
	public String toString() {
		return "MP4 File[downloaded from " + data.toString() + "]";
	}

	
	
	
	
	
	
}
