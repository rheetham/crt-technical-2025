import java.util.ArrayList;

class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add(1, "Mango");

        System.out.println("Initial list: " + fruits);

        String secondFruit = fruits.get(1);
        System.out.println("Second fruit: " + secondFruit);

        fruits.set(2, "Grapes");
        System.out.println("After replacing Banana: " + fruits);

        fruits.remove("Orange");
        fruits.remove(0);

        System.out.println("After removals: " + fruits);

        System.out.println("Number of fruits: " + fruits.size());

        boolean hasMango = fruits.contains("Mango");
        System.out.println("Contains Mango? " + hasMango);

        System.out.println("Is empty? " + fruits.isEmpty());

        fruits.clear();
        System.out.println("After clearing: " + fruits);
        System.out.println("Is empty now? " + fruits.isEmpty());
    }
}