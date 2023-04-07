package solid.ocp.impl;


import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class App {

    public static void main(String[] args) {
        String animalSound;
        //bad
        List<Animal> animals = Arrays.asList(new Cat(), new Dog(), new Lion());
        for (Animal animal : animals ) {
            if(animal instanceof Cat)
                animalSound = "meow";
            if(animal instanceof Dog)
                animalSound = "gaw-gaw";
            if(animal instanceof Lion)
                animalSound = "roar";
        }

        //good
        List<Animal> goodAnimals = Arrays.asList(new Cat(), new Dog(), new Lion());
        for (Animal animal : goodAnimals) {
            log.info("animalSound for {} is : {}", animal.getClass().getSimpleName(), animal.makeSound());
        }

    }
}
