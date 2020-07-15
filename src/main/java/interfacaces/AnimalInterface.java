package interfacaces;

import models.Animal;

public interface AnimalInterface {

    void saveAnimal(Animal animal);

//    List<Animal> getAllAnimals();

    Animal findById(int id);
}
