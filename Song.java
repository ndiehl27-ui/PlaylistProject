/**
 * File for a Song class to be used in the Playlist Project
 * @NandO
 * @1.13.26
 */
public class Song {
    //Fields-- what information do we want each Song to store?

    private double length;
    private String name;
    private String artist;
    private boolean liked;


    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(double length, String name, String artist)
    {
        this.length = length;
        this.name = name;
        this.artist = artist;
        liked = false;

    }
    public double getSeconds()
    {return length;}

    public String getLength()
    {double mins = (int)(length / 60);
     double secs = length % 60;
     String duration = mins + ":" + secs;

        return duration;}

    public String getName()
    {return name;}

    public String getArtist()
    {return artist;}

    public boolean getStatus() //status = liked or not liked
    {return liked;}

    public void changeLike()
    {liked = !liked;}

    public String toString()
    {String toString = "'"+ name + "'" + " by " + artist + "(" + length + ")";
    return toString;
    }
     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */


}
