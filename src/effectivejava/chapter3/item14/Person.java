package effectivejava.chapter3.item14;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }
    // 生成测试代码
    public static void main(String[] args) {
        List<Person> peopleList = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 20)
        );

        Collections.sort(peopleList);

// 输出结果：Charlie, Alice, Bob
        for (Person person : peopleList) {
            System.out.println(person.getName()+" "+person.getAge());
        }

    }
}
