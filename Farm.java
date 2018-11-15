class Farm {
   //your code here
    private Animal[] aBunchOfAnimals;

    public Farm() {
        aBunchOfAnimals = new Animal[3];
        aBunchOfAnimals[0] = new NamedCow("Elsie", "cow", "moo");
        aBunchOfAnimals[1] = new Pig("pig", "oink");
        aBunchOfAnimals[2] = new Chick("chick", "cheep", "cluck");
    }

    public void animalSounds() {
        for (int i = 0; i < aBunchOfAnimals.length; i++) {
           System.out.println(aBunchOfAnimals[i].getType() + " goes " + aBunchOfAnimals[i].getSound());
        }

        System.out.println("The cow is known as " + ((NamedCow)aBunchOfAnimals[0]).getName());
    }
}
