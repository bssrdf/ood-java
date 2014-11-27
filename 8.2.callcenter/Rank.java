package 8.2.callcenter;

public enum Rank{
    Respondor (0), 
    Manager (1),
    Director (2);

    private int value;
    private Rank(int v){
        value = v;
    }

    public int getValue(){
        return value;
    }
}