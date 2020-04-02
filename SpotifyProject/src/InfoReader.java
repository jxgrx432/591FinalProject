import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

//data source https://www.kaggle.com/leonardopena/top50spotify2019/data
/*
Track.Name = Name of the Track
Artist.Name = Name of the Artist
Genre = the genre of the track
Beats.Per.Minute = The tempo of the song.
Energy = The energy of a song - the higher the value, the more energtic the song
Danceability = The higher the value, the easier it is to dance to this song.
Loudness..dB.. = The higher the value, the louder the song.
Liveness = The higher the value, the more likely the song is a live recording.
Valence = The higher the value, the more positive mood for the song.
Length = The duration of the song.
Acousticness = The higher the value the more acoustic the song is.
Speechiness = the higher the value the more spoken word the song contains.
Popularity = the higher the value the more popular the song is.
 */


public class InfoReader {

    String TrackName;
    String ArtistName;
    String Genre;
    int BPM;
    int Energy;
    int Dance;
    int DB;
    int Live;
    int Valence;
    int Length;
    int Acoustic;
    int Speech;
    int Popularity;

    //make parallel arrays for more intuitive indexing
    ArrayList<String> trackName = new ArrayList<String>();
    ArrayList<String> artistName = new ArrayList<String>();
    ArrayList<String> genre = new ArrayList<String>();

    ArrayList<Integer> bPM = new ArrayList<Integer>();
    ArrayList<Integer> energy = new ArrayList<Integer>();
    ArrayList<Integer> dance = new ArrayList<Integer>();
    ArrayList<Integer> decibel = new ArrayList<Integer>();
    ArrayList<Integer> liveMusic = new ArrayList<Integer>();
    ArrayList<Integer> valence = new ArrayList<Integer>();
    ArrayList<Integer> length = new ArrayList<Integer>();
    ArrayList<Integer> acoustic = new ArrayList<Integer>();
    ArrayList<Integer> speech = new ArrayList<Integer>();
    ArrayList<Integer> popularity = new ArrayList<Integer>();




    public void InfoReader () {
        try{
            File csvFile = new File("top50.csv");

            Scanner scanner= new Scanner(csvFile);
            scanner.nextLine(); //skip headers
            scanner.useDelimiter(","); //define delimiter type

            while (scanner.hasNextLine()) {
                String topSong = scanner.nextLine(); //currently only exists in this while loop, need to make permanent 'outside'
                //use String to read and then convert to integers later??

                String[] tempStore = topSong.split(","); //each field of array split by ,
  /*
  Questions
  -  how to understand size of data? i.e.number of columns? number of rows?
  -  after creating tempStore, how to use as parallel arrays? or should I be using hashmaps?
   */
 /*
Goals
- get basic statistics on Integer fields
- basic statistic/ regex on text fields (i.e. most common genres, most common tracks/ artists
extensions...
- build a classifier with goal of figuring out what makes a song popular
- use other available data to see how music trends have evolved
- I have done this with R & python, would like to be able to replicate in Java
  */



//populate arraylists with values from tempStore presentation, csv first column = columnn number
                trackName.add(tempStore[1]);
                artistName.add(tempStore[2]);
                genre.add(tempStore[3]);
                bPM.add(Integer.parseInt(tempStore[4]));
                energy.add(Integer.parseInt(tempStore[5]));
                dance.add(Integer.parseInt(tempStore[6]));
                decibel.add(Integer.parseInt(tempStore[7]));
                liveMusic.add(Integer.parseInt(tempStore[8]));
                valence.add(Integer.parseInt(tempStore[9]));
                length.add(Integer.parseInt(tempStore[10]));
                acoustic.add(Integer.parseInt(tempStore[11]));
                speech.add(Integer.parseInt(tempStore[12]));
                popularity.add(Integer.parseInt(tempStore[13]));


            }




        }catch (FileNotFoundException e){
            e.printStackTrace();
        }


    }




}

