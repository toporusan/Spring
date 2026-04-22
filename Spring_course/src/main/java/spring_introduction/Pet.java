package spring_introduction;

public interface Pet {
    default void say(){
        System.out.println("Вуууууф");
    }
}
