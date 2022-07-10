package oops;

public class Main_control {

	public static void main(String[] args) 
	{
	 kannada_two kannada =new kannada_two();
	 Hindi_songs hindi =new Hindi_songs();
	 Tamil_songs tamil =new Tamil_songs();
	 Telugu_songs telugu =new Telugu_songs();
	 
	 Play_songs.musicplayer(kannada);
	 Play_songs.musicplayer(tamil);
	 Play_songs.musicplayer(hindi);
	 Play_songs.musicplayer(telugu);
	
	 System.out.println("----------------------------------------------------------------------------------------------");
	
	 SONGS Q= new kannada_two();
	 Q.play();
	 if(Q instanceof SONGS)
	 {
	  Kannada_songs	W=(Kannada_songs) Q;
	  W.play1();
	 }
	 
	
	
	
	}
	

}
