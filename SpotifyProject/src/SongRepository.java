import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SongRepository
{
    private ArrayList<Song> songs = new ArrayList<Song>();

    public SongRepository(String filename)
    {
        try {
            File f = new File(filename);
            BufferedReader b = new BufferedReader(new FileReader(f));
            String line = "";

            line = b.readLine(); // skip the header
            while ((line = b.readLine()) != null) {
                //System.out.println(line);
                //"","Track.Name",
                // "Artist.Name","Genre","
                // Beats.Per.Minute","Energy","Danceability","Loudness..dB..","Liveness","Valence.","Length.","Acousticness..","Speechiness.","Popularity"
                String field[] = line.split(",");
                Song song = new Song();
                song.setTrackName(field[1]);
                song.setArtistName(field[2]);
                song.setGenre(field[3]);
                song.setBPM(Integer.parseInt(field[4]));
                getSongs().add(song);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }
}
