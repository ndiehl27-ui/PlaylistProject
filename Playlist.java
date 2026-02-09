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
private ArrayList<Song> songs;



     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
     public Playlist(){
     songs = new ArrayList<Song>();

     }
     /** 
      * @param index-- the position of the Song in the playlist that you want to access
      * @return the Song at the given index in the playlist
      */
     public Song getSongIndex(int index){
      return songs.get(index);
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

 public void addSong(Song s){
       songs.add(s);
 }
 public void likeSong(Song s){
    s.changeLike();
 }
 public void removeSong(Song songObject){
     songs.remove(songObject);
 }
 public String printSongs(){
   String allSongs = "";
  for (int i = 0; i<songs.size(); i++)
   {allSongs += songs.get(i).toString() + "\n";
   }
    return allSongs;
}

 
   public String printLikedSongs(){
    String liked = ""; 
    /*status is private */
     for (Song s : songs){
      if (s.isLiked()){
        liked += s.toString() + "\n";
      }
      }
      return liked;
    }


    public String totalDuration(){
      int totalSeconds = 0;
      for (int i = 0; i <songs.size(); i++)
      { totalSeconds += songs.get(i).getSeconds();}
      int mins = (int)(totalSeconds/60);
     int secs = (int) totalSeconds % 60;
     String duration;
     if (secs < 10) {
      duration = mins + ":0" + secs; 
     } 
      else {
        duration = mins + ":" + secs;
      }
     return duration;  
    }


    public void removeUnlikedSongs(){
      for(int i = 0; i < songs.size(); i++){
        if(songs.get(i).isLiked() == false){
        songs.remove(i); 
        i--; 
      }}}
      
      }
