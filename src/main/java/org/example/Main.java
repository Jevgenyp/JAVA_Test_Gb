package org.example;
public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();
        toyStore.addToy("1", "Doll", 10, 0.1);
        toyStore.addToy("2", "Car", 20, 0.2);
        toyStore.addToy("3", "Ball", 30, 0.3);

        toyStore.draw();
        toyStore.getPrize();
    }
}
