package spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public Person() {
        System.out.println("Person bean created");
    }



    public void callYourPet() {
        String f = pet.say();
        System.out.println("Сработатл метод класса Person.callYourPet(): "+ f);

    }

    public void setPet(Pet pet) {
        System.out.println("Class Person:set pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
