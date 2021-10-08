package javaPrac;

import java.util.*;

public class AppleList {

    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();

        Apple apple1 = new Apple();
        apple1.Name = "aaa";
        apple1.color = "Red";

        Apple apple2 = new Apple();
        apple2.Name = "aaa";
        apple2.color = "Green";

        Apple apple4 = new Apple();
        apple4.Name = "bbb";
        apple4.color = "Green";

        Apple apple3 = new Apple();
        apple3.Name = "aaa";
        apple3.color = "Yellow";

        inventory.add(apple1);
        inventory.add(apple2);
        inventory.add(apple3);
        inventory.add(apple4);
        Map<String , List<Apple>> appleMap = new HashMap<>();


        inventory.forEach(value -> {
            appleMap.put(value.color, inventory.stream().filter(e -> e.color.contains(value.color)).toList() );
        });


        System.out.println(appleMap);


    }

}

class Apple {
         String Name;
         String color;

    @Override
    public String toString() {
        return "Apple{" +
                "Name='" + Name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

