import java.util.ArrayList;

public class Main {

    public static ArrayList<Celebrity> CelebrityList;
    public static void main(String[] args) {
        Player Kirito = new Player("Yvonne");
        Player sans = new Player("Ella");
        CelebrityList = new ArrayList<Celebrity>();
        CelebrityList.add(new Celebrity("Karla Sofía Gascon", "Who is the leading actress in Emilia Perez?"));
        CelebrityList.add(new Celebrity("Demi Moore", "Who is the leading actress in The Substance?"));
        CelebrityList.add(new Celebrity("Timothee Chalame", "Who is the leading actor in A Complete Unknown?"));
        CelebrityList.add(new Celebrity("Ariana Grande", "Who is an actress in a supporting role in Wicked?"));
        CelebrityList.add(new Celebrity("Fernanda Torres", "Who is the leading actress in I am Still Here?"));
        CelebrityList.add(new Celebrity("Colman Domingo", "Who is the lead actor in Sing Sing?"));
        Game game = new Game(Kirito, sans, CelebrityList);
        game.playGame();
        
    }
}
