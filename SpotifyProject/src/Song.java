public class Song

{
    private String TrackName;
    private String ArtistName;
    private String Genre;
    private int BPM;
    private int Energy;
    private int Dance;
    private int DB;
    private int Live;
    private int Valence;
    private int Length;
    private int Acoustic;
    private int Speech;
    private int Popularity;

    public String getTrackName() {
        return TrackName;
    }

    public void setTrackName(String trackName) {
        TrackName = trackName;
    }

    public String getArtistName() {
        return ArtistName;
    }

    public void setArtistName(String artistName) {
        ArtistName = artistName;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public int getBPM() {
        return BPM;
    }

    public void setBPM(int BPM) {
        this.BPM = BPM;
    }

    public int getEnergy() {
        return Energy;
    }

    public void setEnergy(int energy) {
        Energy = energy;
    }

    public int getDance() {
        return Dance;
    }

    public void setDance(int dance) {
        Dance = dance;
    }

    public int getDB() {
        return DB;
    }

    public void setDB(int DB) {
        this.DB = DB;
    }

    public int getLive() {
        return Live;
    }

    public void setLive(int live) {
        Live = live;
    }

    public int getValence() {
        return Valence;
    }

    public void setValence(int valence) {
        Valence = valence;
    }

    public int getLength() {
        return Length;
    }

    public void setLength(int length) {
        Length = length;
    }

    public int getAcoustic() {
        return Acoustic;
    }

    public void setAcoustic(int acoustic) {
        Acoustic = acoustic;
    }

    public int getSpeech() {
        return Speech;
    }

    public void setSpeech(int speech) {
        Speech = speech;
    }

    public int getPopularity() {
        return Popularity;
    }

    public void setPopularity(int popularity) {
        Popularity = popularity;
    }
}
