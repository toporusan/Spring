package spring_introduction;

public interface Pet {
    default void bark(){
        System.out.println("Вуууууф");
    }
}
