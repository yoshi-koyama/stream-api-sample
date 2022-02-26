import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Game horizonZeroDawn = new Game("Horizon Zero Dawn", "Open World", 5000);
        Game lastOfUsPart2 = new Game("The Last of Us Part II", "Horror", 8000);
        Game legendOfZelda = new Game("The Legend of Zelda", "Action Adventure", 7000);
        Game persona5r = new Game("Persona5R", "RPG", 8500);

        List<Game> gameList = Arrays.asList(horizonZeroDawn, lastOfUsPart2, legendOfZelda, persona5r);

        System.out.println("==Filterした結果==");
        List<Game> expensiveGameList = gameList.stream().filter(game -> game.getPrice() < 8000).collect(Collectors.toList());
        expensiveGameList.forEach(System.out::println);

        System.out.println("===Mapした結果==");
        List<String> gameNameList = gameList.stream().map(Game::getName).collect(Collectors.toList());
        gameNameList.forEach(System.out::println);

        System.out.println("===Sortした結果===");
        List<Game> gameListSortedByPrice = gameList.stream().sorted(Comparator.comparing(Game::getPrice).reversed()).collect(Collectors.toList());
        gameListSortedByPrice.forEach(System.out::println);

        System.out.println("===Reduceした結果===");
        int sum = gameList.stream().map(Game::getPrice).reduce(0, Integer::sum);
        System.out.println("合計金額は" + sum + "です。");



    }
}
