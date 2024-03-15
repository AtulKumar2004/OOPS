// abstraction by interface
public class OOPS12 {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();
    }
}
interface ChessPlayer {
    void moves();
}
class Queen implements ChessPlayer{ // inheriting the properties of interface ChessPlayer
    public void moves(){
        System.out.println("up,down,left,right,diag-(in all four dirns)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal- (by one step)");
    }
}