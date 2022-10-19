public class Tile {

    private int firstPart;
    private int secondPart;

    public Tile(int firstPart, int secondPart) {
        this.firstPart = firstPart;
        this.secondPart = secondPart;
    }

    @Override
    public String toString() {
        return firstPart + "-" + secondPart;
    }
}
