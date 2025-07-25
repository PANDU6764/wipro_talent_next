package MiniProjects;

class Cards {
    private String symbol;
    private int number;

    public Cards(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Cards)) return false;
        Cards other = (Cards) obj;
        return this.symbol.equals(other.symbol);
    }

    @Override
    public int hashCode() {
        return symbol.hashCode(); // uniqueness only based on symbol
    }

    @Override
    public String toString() {
        return symbol + " " + number;
    }
}