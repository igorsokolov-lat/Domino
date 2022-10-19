import java.util.Random;

public class TileGenerator extends Tile {
    Random randomTileNumber = new Random();

    int firstNumber = randomTileNumber.nextInt(13);
    int secondNumber = randomTileNumber.nextInt(13);

    public TileGenerator(int firstPart, int secondPart) {
        super(firstPart, secondPart);
    }

    public StringBuilder tileGenerator (){
        Tile tile = new Tile(firstNumber, secondNumber);
        StringBuilder realTile = new StringBuilder(tile.toString());
        return realTile;
    }

    public StringBuilder reverseTileGenerator (){
        Tile reverseTile = new Tile(secondNumber, firstNumber);
        StringBuilder reverseRealTile = new StringBuilder(reverseTile.toString());
        return reverseRealTile;
    }
}
