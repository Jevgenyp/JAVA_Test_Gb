package org.example;
import java.util.*;
import java.io.*;

public class ToyStore {
    private List<Toy> toys;
    private List<Toy> prizes;
    private Random random;

    public ToyStore() {
        this.toys = new ArrayList<>();
        this.prizes = new ArrayList<>();
        this.random = new Random();
    }

    public void addToy(String id, String name, int quantity, double frequency) {
        toys.add(new Toy(id, name, quantity, frequency));
    }

    public void setFrequency(String id, double frequency) {
        for (Toy toy : toys) {
            if (toy.getId().equals(id)) {
                toy.setFrequency(frequency);
                return;
            }
        }
    }

    public void draw() {
        for (Toy toy : toys) {
            if (toy.getQuantity() > 0 && random.nextDouble() < toy.getFrequency()) {
                toy.decreaseQuantity();
                prizes.add(toy);
            }
        }
    }

    public void getPrize() {
        if (!prizes.isEmpty()) {
            Toy toy = prizes.get(0);
            prizes.remove(0);
            try (FileWriter writer = new FileWriter("prizes.txt", true)) {
                writer.write(toy.getId() + "; " + toy.getName() + "\n");
            } catch (IOException e) {
                // Handle the exception
            }
        }
    }
}
