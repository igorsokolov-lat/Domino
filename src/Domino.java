import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Domino {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playersAmount = scanner.nextInt();
        TileGenerator tile = new TileGenerator();
        List<StringBuilder> tiles = new ArrayList<>();
        StringBuilder number;
        StringBuilder reverseNumber;
        while (tiles.size() < 91 / playersAmount) {
            number = tile.tileGenerator();
            reverseNumber = tile.reverseTileGenerator();
            for (StringBuilder s:
                 tiles) {
                if(s.equals(number) || s.equals(reverseNumber)) {
                    return;
                } else {
                    tiles.add(number);
                }
            }
        }
        for (StringBuilder s:
             tiles) {
            System.out.print(s + " ");
        }
    }
}
