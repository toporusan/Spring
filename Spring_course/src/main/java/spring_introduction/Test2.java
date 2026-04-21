package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("myDog", Pet.class);
        Pet pet2 = context.getBean("myCat", Pet.class);
        pet.bark();
        pet2.bark();

        context.close();
    }
}
