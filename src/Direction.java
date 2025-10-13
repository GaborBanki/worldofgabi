public enum Direction {

    ESZAK("észak"),
    DEL("dél"),
    KELET("kelet"),
    NYUGAT("nyugat");

    private final String direction;

    Direction(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return direction;
    }
}
