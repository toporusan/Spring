package spring_introduction;

public class Dog implements Pet {

    Dog() {
        System.out.println("Dog bean created");
    }
    @Override
    public String  say() {
        return "Гав-гав!";
    }

}
