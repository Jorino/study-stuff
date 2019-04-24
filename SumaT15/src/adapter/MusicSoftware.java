package adapter;

public class MusicSoftware implements MusicAdapter {
	
	private Song song;

	@Override
	public void playMusic() {
		if(song != null) {
			
			System.out.println("\nNext playing:\t" + song.getName() + "\tKey:\t" + song.getKey());
			
			for(int i = 0 ; i < song.getLength() ; i++) {
				System.out.println("=");
			}
			System.out.println("\nSong has been played.\n");
		} else {
			System.out.println("Song hasn't been selected.");
		}
	}
	
	
	@Override
	public void showNotation() {
		if(song != null) {
			System.out.println("\nNotes for " + song.getName() + " in the key of " + song.getKey());
			
			for(int i = 0 ; i <= song.getNotepages() ; i++) {
				System.out.println("Notes");
			}
		}
	}

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}
	
	
}
