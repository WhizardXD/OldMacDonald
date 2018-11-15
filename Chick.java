class Chick extends FarmAnimal implements Animal {
    
    private String mySound1, mySound2;
    private int a;

    public Chick(String type, String sound1, String sound2) {
        myType = type;
        mySound1 = sound1;
        mySound2 = sound2;
        a = (int)(Math.random()*2);
    }

    public Chick() {
        myType = "unknown";
        mySound = "unknown";
    }

    public String getSound() {
        if (a == 0) {
            return mySound1;
        } else {
            return mySound2;
        }
    }

    public String getType() {return myType;}
}
