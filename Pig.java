class Pig extends FarmAnimal implements Animal {
    public Pig(String type, String sound) {
        myType = type;
        mySound = sound;
    }

    public Pig() {
        myType = "unknown";
        mySound = "unknown";
    }
}
