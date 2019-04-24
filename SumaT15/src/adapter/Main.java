package adapter;

public class Main {

	public static void main(String[] args) {
		
		MusicSoftware softa = new MusicSoftware();
		
		Song song1 = new Song("Hotel California", "Bm", 5 , 6.31);
		Song song2 = new Song("Hopeinen kuu" ,"Em" , 7 , 3.19);
		
		softa.setSong(song1);
		softa.playMusic();
		softa.showNotation();
		
		softa.setSong(song2);
		softa.playMusic();
		softa.showNotation();

	}

}
