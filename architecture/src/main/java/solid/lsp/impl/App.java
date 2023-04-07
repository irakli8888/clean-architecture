package solid.lsp.impl;


import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class App {

    public static void main(String[] args) {
        int legCount;
        //bad
        List<Animal> animals = Arrays.asList(new Cat(), new Dog(), new Lion(), new Pigeon(), new Snake());
        for (Animal animal : animals ) {
            if(animal instanceof Cat)
                legCount = 4;
            if(animal instanceof Dog)
                legCount = 4;
            if(animal instanceof Lion)
                legCount = 4;
            if(animal instanceof Pigeon)
                legCount = 2;
            if(animal instanceof Snake)
                legCount = 0;
        }

        //good
        List<Animal> goodAnimals = Arrays.asList(new Cat(), new Dog(), new Lion());
        for (Animal animal : goodAnimals) {
            log.info("leg count for {} is : {}", animal.getClass().getSimpleName(), animal.legCount());
        }

    }
}
