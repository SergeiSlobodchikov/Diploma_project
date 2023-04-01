package Details;

import java.util.ArrayList;

public class LegoSet {
    private String name;
    private ArrayList<LegoPart> parts;

    // Конструктор класса
    public LegoSet(String name, ArrayList<LegoPart> parts) {
        this.name = name;
        this.parts = parts;
    }

    // Методы для доступа к полям класса
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<LegoPart> getParts() {
        return parts;
    }

    public void setParts(ArrayList<LegoPart> parts) {
        this.parts = parts;
    }

    // Метод для подсчета количества деталей в конструкторе
    public int getTotalParts() {
        int total = 0;
        for (LegoPart part : parts) {
            total += part.getQuantity();
        }
        return total;
    }

    // Метод для проверки, хватит ли деталей для сборки конструктора
    public boolean hasEnoughParts(LegoSet set) {
        for (LegoPart part : set.getParts()) {
            for (LegoPart myPart : this.parts) {
                if (part.getName().equals(myPart.getName()) && part.getColor().equals(myPart.getColor())) {
                    if (part.getQuantity() > myPart.getQuantity()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}