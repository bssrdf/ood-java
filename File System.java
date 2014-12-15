public abstract class Entry{
    protected Directory parent;
    protected long created;
    protected long lastUpdated;
    protected long lastAccessed;
    protected String name;

    public Entry(String n, Directory p){}

    public boolean delete(){}
    public abstract int size();
    public String getFullPath(){}

    // getters and setters

}

public class File extends Entry{
    private String contents;
    private int size;
    public File(String n, Directory p, int sz){
        super(n,p);
        size = sz;
    }
    public int size(){}
    public String getContents(){}
    public void setContents(String c){}

}

public class Directory extends Entry{
    protected ArrayList<Entry> contents;
    public Directory(String n, Directory p){}
    public int size(){}
    public int numberOfFiles(){}
    public boolean deleteEntry(Entry entry){}
    public void addEntry(Entry entry){}
    protected ArrayList<Entry> getContents(){}
}