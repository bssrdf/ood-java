public class Jukebox{
    private CDPlayer cdPlayer;
    private User user;
    private Set<CD> cdCollection;
    private SongSelector ts;
    public Jukebox(CDPlayer cdPlayer, User user, Set<CD> cdCollections, SongSelector ts){}
    public Song getCurrentSong(){
        return ts.getCurrentSong();
    }
    public void setUser(User u){
        this.user = u;
    }
}

public class CDPlayer{
    private Playlist p;
    private CD c;
    public CDPlayer(CD c, Playlist p){}
    public CDPlayer(Playlist p){ this.p = p;}
    public CDPlayer(CD c){ this.c = c;}

    public void playSong(Song s){}
    public Playlist getPlaylist(){return p;}
    public void setPlaylist(Playlist p){ this.p = p;}
    public CD getCD(return c);
    public void setCD(CD c){ this.c=c;}
}

public class Playlist{
    private Song song;
    private Queue<Song> queue;
    public Playlist(Song song, Queue<Song> queue){}
    public Song getNextSToPlay(){
        return queue.peek();
    }
    public void queueUpSong(Song s){
        queue.add(s);
    }
}

public class CD{
    // id, artist, songs, etc.
}

public class Song{
    // id, CD, title, length, etc.
}

public class User{
    // id, name, etc.
}

