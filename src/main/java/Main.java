import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Game horizonZeroDawn = new Game("Horizon Zero Dawn", "Open World", 5000);
        Game lastOfUsPart2 = new Game("The Last of Us Part II", "Horror", 8000);
        Game legendOfZelda = new Game("The Legend of Zelda", "Action Adventure", 7000);
        Game persona5r = new Game("Persona5R", "RPG", 8500);

        List<Game> gameList = Arrays.asList(horizonZeroDawn, lastOfUsPart2, legendOfZelda, persona5r);
        for (Game game : gameList) {
            System.out.println("title: " + game.getName());
            System.out.println("price: " + game.getPrice());
        }




    }
}
