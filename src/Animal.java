public class Animal {


    final static Double MIN_WEIGHT = 2.0;
    private Double weight = 6.0;
    final public String species;
    public Boolean isAlive = true;

    public Animal(String species) {
        this.species = species;
    }

    void feed(Double foodWeight) {
        if (this.isAlive) {
            this.weight += foodWeight;
            System.out.println("It was for good. It will be fat");
        } else {
            System.out.println("Too late, the dog dead");
        }
    }

    void takeForAWalk() {
        if (this.isAlive) {
            this.weight--;
            System.out.println("The walks are great");
            if (this.weight < MIN_WEIGHT) {
                this.isAlive = false;
            }
        } else {
            System.out.println("Not have power");

        }
    }

    Double getWeight() {
        return weight;
    }


}

