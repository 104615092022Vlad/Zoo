import java.util.Random;
public class Hippopotamus extends Animal{
    Random r = new Random();

    //чистота гиппопотама
    private boolean cleanliness = r.nextBoolean();

    public boolean getCleanliness() {
        return cleanliness;
    }

    public void setCleanliness(boolean cleanliness) {
        this.cleanliness = cleanliness;
    }
}

