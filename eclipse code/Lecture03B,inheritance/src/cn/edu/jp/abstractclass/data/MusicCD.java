package cn.edu.jp.abstractclass.data;



public class MusicCD extends Item {
    
	private String artist;

	public MusicCD(String title, float listPrice,String artist) {
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
