
import java.util.ArrayList;

/**
 * The purpose of the UserPlaylist class is to take playlist data from the DataAnalysis class and 
 * format it for display to the end user via MainDisplay.
 * @author johngriffin
 */


public class UserPlaylist {

	// instance variables
	
	ArrayList<Song> userPlaylist = new ArrayList<Song>();    // ArrayList of songs for the user playlist
	
	// constructor 
	
	public UserPlaylist(ArrayList<Song> userPlaylist) {
		this.userPlaylist = userPlaylist;
	}
	
	// methods
	
	/**
	 * Method to take relevant Song class data and put into data structure for displaying playlist
	 */
	public void formatPlaylist() {
		for(Song song : userPlaylist) {
			// take relevant Song class data and put into data structure for displaying playlist
		}
	}
	
	/**
	 * Method to create JavaFX graphic element to display in MainDisplay class
	 */
	public void createPlaylistGraphics() {
	}
	
	
	
}
