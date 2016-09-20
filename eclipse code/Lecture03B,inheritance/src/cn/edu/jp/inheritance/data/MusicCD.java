/**
 * 
 */
package cn.edu.jp.inheritance.data;

/**
 * @author lee hongli
 * 
 */
public class MusicCD extends Item {

	private String artist;

	public MusicCD(String title, String artist, float listPrice) {
		super(title, listPrice);
		this.artist = artist;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return artist + "," + super.toString();
	}
    
	
}
