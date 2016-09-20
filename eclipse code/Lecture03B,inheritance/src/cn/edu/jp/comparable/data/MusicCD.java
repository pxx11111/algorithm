package cn.edu.jp.comparable.data;

public class MusicCD extends Item{

	private String artist;
	
	public MusicCD(String title,String artist, float listPrice) {
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
	public String getName() {
		// TODO Auto-generated method stub
		return artist + "," + title;
	}

}
