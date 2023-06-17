package org.example;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        ToyQueue toyQueue = new ToyQueue();
        toyQueue.put("12; конструктор; 2");
        toyQueue.put("22; робот; 3");
        toyQueue.put("36; кукла; 1");

        try {
            PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
            for (int i = 0; i < 10; i++) {
                Toy toy = toyQueue.get();
                if (toy != null) {
                    writer.println(toy.getId());
                }
            }
            writer.close();
        } catch (IOException e) {
            // обработка исключения+
            
        }
    }
}
