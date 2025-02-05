import java.util.ArrayList;

public class Game {
    public ArrayList<Celebrity> myList;
    public Player p1;
    public Player p2;

    public Game(Player pl1,Player pl2,ArrayList<Celebrity> list){
        myList = list;
        p1 = pl1;
        p2 = pl2;
    }

    public void shuffle(){

    for (int i = 0; i < 500; i++ )
    {
      int temp = (int)(myList.size() * Math.random());
      myList.add(myList.remove( temp ) );
    }
  }

}
