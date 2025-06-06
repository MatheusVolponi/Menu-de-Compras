public class Shopping implements Comparable<Shopping>{
    private String description;
    private double price;

    public Shopping(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Compra. Descrição: " + description + " Valor: " + price;
    }

    @Override
    public int compareTo(Shopping o) {
        return Double.compare(this.price, o.price);
    }
}
