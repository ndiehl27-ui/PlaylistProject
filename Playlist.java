import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
ArrayList<Song> songs;



     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
     public Playlist(){
     songs = new ArrayList<Song>();

     }

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */

 public void addSong(Song toString){
       songs.add(toString);
 }
 public void likeSong(){
    changeLike();
 }
 public void removeSong(Song toString){
    songs.remove(toString);
 }
 public void printSongs(){
   for (int i = 0; i<songs.size(); i++)
   {system.out.print(song(i).toString());}}

 
 public void printLikedSongs(){
   for(int i=0; i<songs.size();i++)
    {if ((songs(i).status).equals(true)){
        System.out.println(songs(i));
    }}

 }
    public String totalDuration(){
      int totalSeconds = 0;
      for (int i = 0; i <songs.size(); i++)
      { totalSeconds += songs(i).getSeconds();}
      double mins = (int)(totalSeconds/60);
     double secs = totalSeconds % 60;
     String duration = mins + ":" + secs;
     return duration;  
    }


    public void removeUnlikedSongs(){
      for(int i = 0; i<songs.size();i++){
        if ((songs(i).status).equals(false)){
            songs.remove(toString);
        }}}
      
      }
