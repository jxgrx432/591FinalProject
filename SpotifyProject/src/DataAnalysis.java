import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

public class DataAnalysis
{
    public static void main(String args[])
    {
        System.out.println("TOP 50 Songs of 2019 Stats");
        System.out.println("--------------------------");

        SongRepository songRepository2019 = new SongRepository("top50.csv");

        int count = 0;
        double sumBPM = 0.0;
        double minBPM = Double.MAX_VALUE;
        double maxBPM = Double.MIN_VALUE;
        TreeMap<String,Integer> hitsPerArtist = new TreeMap<String,Integer>();
        for(Song song : songRepository2019.getSongs())
        {
            //System.out.println(song.getBPM() + "\t" + song.getTrackName());
            sumBPM += song.getBPM();
            if(song.getBPM() > maxBPM)
            {
                maxBPM=song.getBPM();
            }
            if(song.getBPM() < minBPM)
            {
                minBPM=song.getBPM();
            }
            if(hitsPerArtist.containsKey(song.getArtistName()))
            {
                hitsPerArtist.put(song.getArtistName(),hitsPerArtist.get(song.getArtistName())+1);
            }
            else
            {
                hitsPerArtist.put(song.getArtistName(),1);
            }
            count++;
        }
        System.out.println("Total Songs:" + count);
        double averageBPM = sumBPM / count;
        System.out.println("Average BPM:" + averageBPM);
        System.out.println("Min BPM:" + minBPM);
        System.out.println("Max BPM:" + maxBPM);
        System.out.println("Hits PEr Artist:");
        for(String key : hitsPerArtist.keySet())
        {
            System.out.println(" " +hitsPerArtist.get(key) + "\t" + key);
        }

    }
}


