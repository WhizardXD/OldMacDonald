class Cow extends FarmAnimal implements Animal {

    public Cow(String type, String sound) {
        myType = type;
        mySound = sound;
    }

    public Cow() {
        myType = "unknown";
        mySound = "unknown";
    }
}
