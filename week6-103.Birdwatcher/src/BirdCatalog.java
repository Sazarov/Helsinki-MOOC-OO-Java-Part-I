import java.util.ArrayList;

public class BirdCatalog {
    private ArrayList<Bird> birds = new ArrayList<Bird>();

    public void addBird(Bird bird) {
        this.birds.add(bird);
    }

    public void observe(String birdName) {

        Bird bird = findBirdByName(birdName);
        if(bird != null) {
            bird.observe();
        } else {
            System.out.println("Is not a bird!");
        }
    }

    public void showBird(String name) {
        Bird bird = findBirdByName(name);
        if(bird != null) {
            System.out.println(bird.toString());
        } else {
            System.out.println("Is not a bird!");
        }
    }
    public Bird findBirdByName(String birdName) {
        Bird found = null;
        for (Bird loggedBird :
                this.birds) {
            if (loggedBird.getName().equals(birdName)) {
                found=loggedBird;
            }
        }

        return found;
    }
    public void printCatalog() {
        for (Bird bird :
                this.birds) {
            System.out.println(bird.toString());
        }
    }
}
