public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Zoo myZoo = new Zoo("Safari Park", "Paris", 25);

        myZoo.displayZoo();
        System.out.println(myZoo);

        Animal tiger = new Animal("Felidae", "Tiger", 4, true);
        Animal[] zooAnimals = myZoo.getAnimals();
        zooAnimals[0] = lion;
        zooAnimals[1] = tiger;

        System.out.println(lion);
        System.out.println(tiger);
    }
}
