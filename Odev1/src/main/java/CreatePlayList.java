import java.util.ArrayList;

/**
 * Created by Can on 25.4.2017.
 */
public class CreatePlayList {
    String singerName;
    String albums;
    int totalDuration;
    String songListName;
    String albumList;
    String songListSinger;
    int songListDuration;
    String url;

    public ArrayList<String> albumsSing = new ArrayList<String>();

    public void PlayList(String singerName, String albums, int totalDuration){
        this.singerName = singerName;
        this.albums = albums;
        this.totalDuration = totalDuration;


        albumsSing.add("song1");
        albumsSing.add("song2");
        albumsSing.add("song3");
        albumsSing.add("song4");
        System.out.println(singerName + " " + albums + " "  + albumsSing + " " + url + " " + totalDuration);
    }


    public void SongList(String songListName, String albumList, String songListSinger, int songListDuration, String url){
        this.songListName = songListName;
        this.albumList = albumList;
        this.songListSinger = songListSinger;
        this.songListDuration = songListDuration;
        this.url = url;
        System.out.println(songListName + " " + albumList + " " + songListSinger + " " + songListDuration + " " +url);
    }

    public boolean ContainsPlayList(String input) {

        if (input == null){
            return false;
        }
        return albumsSing.contains(input.toLowerCase());
    }


}
