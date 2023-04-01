package Details;

public class LegoPart {
    private String name;
    private String color;
    private int quantity;

    // Конструктор класса
    public LegoPart(String name, String color, int quantity) {
        this.name = name;
        this.color = color;
        this.quantity = quantity;
    }

    // Методы для доступа к полям класса
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}