package effectivejava.chapter5.item33;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/11/26
 */
public class CastExample {

    static class Animal {
        public void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        // 使用Class对象的cast方法进行类型转换
        try {
            Animal castedAnimal = Animal.class.cast(dog); // 成功转换，因为dog是Animal的子类实例
            castedAnimal.makeSound(); // 输出: Dog barks

            Dog castedDog = Dog.class.cast(animal); // 抛出ClassCastException异常，因为animal不是Dog的实例
            castedDog.makeSound();
        } catch (ClassCastException e) {
            System.out.println("转换失败: " + e.getMessage());
        }
    }
}
