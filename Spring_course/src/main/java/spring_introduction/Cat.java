package spring_introduction;

public class Cat implements Pet {
     Cat() {
        System.out.println("Cat bean created");
    }

    @Override
    public String say() {
        return "Мяу Мяу";
    }
}
