package spring_introduction;

public class Test1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();

        Pet pet = new Dog();
        pet.bark();

        Pet pet2 = new Cat();
        pet2.bark();
    }
}
