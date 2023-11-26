package effectivejava.chapter5.item28;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/11/23
 */
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }


    /**
     * 数组协变案例
     */
    public void demo01() {
        // 创建一个Dog数组
        Dog[] dogs = {
                new Dog("Buddy"),
                new Dog("Max"),
                new Dog("Charlie")
        };

        // 将Dog数组赋值给Animal数组，这是协变的表现
        Animal[] animals = dogs;

        // 遍历Animal数组，并调用makeSound方法
        for (Animal animal : animals) {
            animal.makeSound();
        }

        // 创建一个Cat对象
        Cat cat = new Cat("Whiskers");

        // 尝试向animals数组中添加Cat对象，这将导致异常
        try {
            //这是数组具体化的体现
            animals[0] = cat; // 运行时异常：java.lang.ArrayStoreException
        } catch (ArrayStoreException e) {
            System.out.println("Cannot add Cat to the array of Dogs. " + e.getMessage());
        }
    }

    /**
     * 泛型非协变案例
     */
    public void demo02(){
        // 创建一个List<Dog>
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Buddy"));
        dogs.add(new Dog("Max"));
        dogs.add(new Dog("Charlie"));

        // 尝试将List<Dog>赋值给List<Animal>，编译时错误，因为泛型没有协变。
        //List<Animal> animals = dogs; // 编译错误
    }

    /**
     * 数组具体化案例
     */
    public void demo03() {
        // 创建一个Dog数组
        Dog[] dogs = {
                new Dog("Buddy"),
                new Dog("Max"),
                new Dog("Charlie")
        };

        // 将Dog数组赋值给Animal数组，这是协变的表现
        Animal[] animals = dogs;
        // 创建一个Cat对象
        Cat cat = new Cat("Whiskers");

        // 尝试向animals数组中添加Cat对象，这将导致异常
        try {
            //这是数组具体化的体现
            animals[0] = cat; // 运行时异常：java.lang.ArrayStoreException
        } catch (ArrayStoreException e) {
            System.out.println("Cannot add Cat to the array of Dogs. " + e.getMessage());
        }
    }

    /**
     * 泛型非具体案例
     */
    public void demo04(){
        // 创建一个List<Dog>
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Buddy"));
        dogs.add(new Dog("Max"));
        dogs.add(new Dog("Charlie"));

        // 但是，我们可以使用通配符来实现类似的功能
        List<? extends Animal> animals = dogs;

        // 尝试向List<? extends Animal>中添加新的Animal，编译错误，因为不知道具体类型。
        //animals.add(new Cat("Whiskers")); // 编译错误
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        animal.demo01();
        animal.demo02();
    }
}
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
