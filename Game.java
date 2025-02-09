import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public ArrayList<Celebrity> extraList;
    public ArrayList<Celebrity> myList;
    public Player p1;
    public Player p2;
    public int currentPlayer = 1;
    public int roundNum = 1;
    public Scanner scanner = new Scanner(System.in);
    public String nextName;
    public Game(Player pl1,Player pl2,ArrayList<Celebrity> list){
        extraList = list;
        myList = list;
        p1 = pl1;
        p2 = pl2;
        shuffle();
        nextName = p1.getName();
    }

    public void shuffle(){
    for (int i = 0; i < 500; i++ )
    {
      int temp = (int)(myList.size() * Math.random());
      myList.add(myList.remove( temp ) );
    }
  }

  public Celebrity dealCelebrity()
  {
    if ( myList.size() > 0 )
    {
      return myList.remove( 0 );
    }
    else
    {
      System.out.println( "The [myList] is empty." );
      return null;
    }
  }


  public void playRound(){
    Celebrity next = dealCelebrity();
    System.out.println("Round " + roundNum + ":");
    System.out.println(nextName + ", " + next.getHint());
    String guess = scanner.nextLine();

    if(currentPlayer == 1 && next.guess(guess))
      {p1.win();
        currentPlayer = 2;
        System.out.println("Right");
        nextName = p2.getName();}
    else if(currentPlayer == 1 && !next.guess(guess))
      {p2.win();
        currentPlayer = 2;
        System.out.println("Wrong");
        nextName = p2.getName();}
    else if(currentPlayer == 2 && next.guess(guess))
      {p2.win();
        currentPlayer = 1;
        System.out.println("Right");
        nextName = p1.getName();}
    else if(currentPlayer == 2 && !next.guess(guess))
      {p1.win();
        currentPlayer = 1;
        System.out.println("Wrong");
        nextName = p1.getName();}
        roundNum++;
  }
  public void playGame(){
    p1.reset();
    p2.reset();
    playRound();
    playRound();
    playRound();
    if(p1.getPoints() > p2.getPoints())
      System.out.println(p1.getName() + ", you win!");
    else
      System.out.println(p2.getName() + ", you win!");
    myList = extraList;
  }

}
