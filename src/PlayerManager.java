import java.util.Scanner;

public class PlayerManager {
    private int numPlayers;
    private Scanner textReader;
    public PlayerManager(){
        textReader = new Scanner(System.in);
        selectPlayers();
    }
    private void selectPlayers(){
        print("Select your character");
        print("Choice #1: Malcolm");
        print("Skilled thief, but overall harmless. Carries a curved blade as a threat, but has never been used to harm " +
                "anyone. Spends his time in his tent on the edge of the town napping and planning for his next big mission.");
        print("Strength: 4");
        print("Speed: 7");
        print("Intelligence: 4");
        print("Strategy: 9");
        print("Luck: 6");

        print("Choice #2: Ray");
        print("");
    }
    private void print(Object object){
        System.out.print(object);
    }
    public static void main(String[] argv){
        PlayerManager manager = new PlayerManager();
    }
}
