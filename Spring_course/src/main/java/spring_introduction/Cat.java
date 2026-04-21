package spring_introduction;

public class Cat implements Pet {
    @Override
    public void bark() {
        System.out.println("Meow meow!");
    }
}
