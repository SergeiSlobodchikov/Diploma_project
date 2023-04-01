package Details;

import java.util.HashMap;

public class LegoUser {
    private String name;
    private HashMap<String, Integer> parts;

    // Конструктор класса
    public LegoUser(String name, HashMap<String, Integer> parts) {
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

    public HashMap<String, Integer> getParts() {
        return parts;
    }

    public void setParts(HashMap<String, Integer> parts) {
        this.parts = parts;
    }

    // Метод для добавления детали пользователю
    public void addPart(String name, int quantity) {
        if (parts.containsKey(name)) {
            int currentQuantity = parts.get(name);
            parts.put(name, currentQuantity + quantity);
        } else {
            parts.put(name, quantity);
        }
    }

    // Метод для удаления детали у пользователя
    public void removePart(String name, int quantity) {
        if (parts.containsKey(name)) {
            int currentQuantity = parts.get(name);
            if (currentQuantity - quantity > 0) {
                parts.put(name, currentQuantity - quantity);
            } else {
                parts.remove(name);
            }
        }
    }
}
