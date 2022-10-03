package lesson7;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Cat cat2 = new Cat();

        dog.setName("Charles");
        cat.setName("Tommy");
        dog2.setName("Cherry");
        dog3.setName("Jonny");
        cat2.setName("Bars");

        dog.run(300);
        dog.swim(5);
        cat.run(245);
        cat.swim(3);
        dog2.run(124);
        dog2.swim(45);
        dog3.run(355);
        dog3.swim(10);
        cat2.run(175);
        cat2.swim(89);

        for (int i = 0; i < 0; i++) {
            new Animal();
        }
        System.out.println(Animal.count + " animals");

        for (int i = 0; i < 0; i++) {
            new Dog();
        }
        System.out.println(Dog.count + " dogs");

        for (int i = 0; i < 0; i++) {
            new Cat();
        }
        System.out.println(Cat.count + " cats");
    }

}
