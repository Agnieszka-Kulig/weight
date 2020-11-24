public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog");

        dog.feed(0.2);
        dog.takeForAWalk();
        dog.feed(0.7);
        dog.takeForAWalk();
        dog.feed(1.0);
        dog.feed(1.0);
        dog.feed(1.0);
        dog.feed(2.0);



        while (dog.isAlive) {
            dog.takeForAWalk();


        }

        dog.feed(0.2);

    }
}
