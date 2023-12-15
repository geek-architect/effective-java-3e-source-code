package effectivejava.chapter5.item32;

import java.lang.reflect.Array;
import java.util.List;

// It is unsafe to store a value in a generic varargs array parameter (Page 146)
public class Dangerous {

    static void dangerous1(List<String>... stringLists) {

        for(List<String> stringList : stringLists) {
            System.out.println(stringList);
        }
        if(stringLists.getClass().isArray()){
            System.out.println("stringLists is array");
        }else{
            System.out.println("stringLists is not array");
        }

        System.out.println(stringLists.length);

        if(stringLists instanceof List[]){
        //if(stringLists instanceof List<String>[]){
            System.out.println("stringLists instanceof List[]");
        }else{
            System.out.println("stringLists not instanceof List[]");
        }
    }
    /*
    Mixing generics and varargs can violate type safety!
    堆污染案例
     */
    static void dangerous2(List<String>... stringLists) {
        //数组支持协变
        Object[] objects = stringLists;
        List<Integer> intList = List.of(42);
        objects[0] = intList; // Heap pollution
        String s= stringLists[0].get(0); // ClassCastException
        System.out.println(s);
    }

    public static void main(String[] args) {
        dangerous2(List.of("There be dragons!"),List.of("There be dog!"));
    }
}
