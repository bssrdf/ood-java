class Edge{
    enum Type{inner, outer, flat}
    Piece parent;
    Type type;
    int index;
    Edge attached_to;

    boolean fitsWith(Edge edge){}
}

class Piece{
    Edge[] edges;
    boolean isCorner(){}
}

class Puzzle{
    Piece[] pieces;
    Piece[][] solution;

    Edge[] inners, outers, flats;
    Piece[] corners;

    void sort(){}
    void solve(){}
}

