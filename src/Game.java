public class Game {
    private Detective detective;
    private ScenePlayer scenes;

    public Game(){
        detective = new Detective();
        scenes = new ScenePlayer();
        System.out.println("yay");
    }
    public static void main(String argv[]){
        Game game = new Game();
    }
}
