abstract class Animal // 抽象类
{
    public abstract void makeSound(); // 抽象方法

    public void eat()
    {
        System.out.println("The animal is eating ~ ");
    }
}

class Dog extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("Woof Woof ~ ");
    }
}

public class AbstractClassExample {
    public static void main(String[] args)
    {
        Dog animal = new Dog(); // 此处也可以使用 Animal animal = new Dog();
        animal.makeSound();
        animal.eat();
    }
}
