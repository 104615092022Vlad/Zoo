import java.util.Random;
public class Cats extends Animal{
    Random r = new Random();
    //лохматость
    private boolean shaggy = r.nextBoolean();

    public boolean getShaggy() {
        return shaggy;
    }

    public void setShaggy(boolean shaggy) {
        this.shaggy = shaggy;
    }

    public Cats(String name) {
        super(name);
    }
}

