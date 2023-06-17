package org.example;

public class Toy {
    private int id;
    private String name;
    private int weight;

    public Toy(String inputString) {
        String[] parts = inputString.split(";");
        this.id = Integer.parseInt(parts[0].trim());
        this.name = parts[1].trim();
        this.weight = Integer.parseInt(parts[2].trim());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}
