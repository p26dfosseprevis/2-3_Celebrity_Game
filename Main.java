import java.util.ArrayList;

public class Main {

    public static ArrayList<Celebrity> CelebrityList;
    public static void main(String[] args) {
        
        CelebrityList = new ArrayList<Celebrity>();
        CelebrityList.add(new Celebrity("name", "hint"));
        System.out.println("");
    }
}
